package com.example.androidmaterialdesignui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_intro);
    }

    public void btngetStartedPressed(View view) {
        Intent intent =new Intent(MainActivity.this,loginactivity.class);
        startActivity(intent);
        finish();
    }
}