package com.example.finalproject4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class orderActivity extends AppCompatActivity {

    CardView TicketList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        TicketList = findViewById(R.id.ticketList);
        TicketList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddPopUpReview();
            }
        });

    }

    private void AddPopUpReview() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater layoutInflater = this.getLayoutInflater();
        View dialogView = layoutInflater.inflate(R.layout.layout_review,null);
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}