package com.example.finalproject4.bustripdetail;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.finalproject4.R;

public class Home extends AppCompatActivity {

    PopupWindow pwindo;
    TextView textviewSeekbar;
    SeekBar seekBar;
    EditText editTextseat;
    Button cancelbutton;
    Button selectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        editTextseat = findViewById(R.id.seat);
        editTextseat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPopupSeekbar();
            }
        });


    }

    public void addPopupSeekbar(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater layoutInflater = this.getLayoutInflater();
        View dialogView = layoutInflater.inflate(R.layout.chooseseatactivity,null);
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


        seekBar = dialogView.findViewById(R.id.seekbarseat);
        textviewSeekbar = dialogView.findViewById(R.id.txtviewnumberseat);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textviewSeekbar.setText(""+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        cancelbutton = dialogView.findViewById(R.id.cancel_button);
        cancelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });

        selectButton = dialogView.findViewById(R.id.select_Button);



    }

}