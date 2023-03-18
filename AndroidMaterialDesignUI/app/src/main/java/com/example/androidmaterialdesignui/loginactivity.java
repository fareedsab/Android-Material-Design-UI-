package com.example.androidmaterialdesignui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }        setContentView(R.layout.activity_login);
    }

    public void btnLoginPressed(View view) {
        Intent intent =new Intent(loginactivity.this,SignUpActivity.class);
        startActivity(intent);
        finish();
    }
}