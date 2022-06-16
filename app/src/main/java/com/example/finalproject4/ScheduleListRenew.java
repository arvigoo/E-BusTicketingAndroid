package com.example.finalproject4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.finalproject4.bustripdetail.Home;

public class ScheduleListRenew extends AppCompatActivity {
    TextView txtDeparture, txtArrival;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_list_renew);

        txtDeparture = findViewById(R.id.txtdeparture);
        txtDeparture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchDeparturePopUP();
            }
        });

        txtArrival = findViewById(R.id.txtarrival);
        txtArrival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchDestinationPopUP();
            }
        });
    }

    private void searchDestinationPopUP() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater layoutInflater = this.getLayoutInflater();
        View searchDestinationPopUpView = layoutInflater.inflate(R.layout.activity_search_destination, null);
        builder.setView(searchDestinationPopUpView);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void searchDeparturePopUP() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater layoutInflater = this.getLayoutInflater();
        View searchDeparturePopUpView = layoutInflater.inflate(R.layout.search_departure, null);
        builder.setView(searchDeparturePopUpView);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void backbutton(View view) {
        startActivity(new Intent(ScheduleListRenew.this, Home.class));
    }
}