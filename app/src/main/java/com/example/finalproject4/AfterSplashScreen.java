package com.example.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AfterSplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_splash_screen);
    }

    public void Login(View view) {
        startActivity(new Intent(AfterSplashScreen.this, Login.class));
    }

    public void Register(View view) {
        startActivity(new Intent(AfterSplashScreen.this,Register.class));
    }
}