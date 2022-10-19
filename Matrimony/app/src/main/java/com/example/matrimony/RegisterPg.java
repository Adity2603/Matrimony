package com.example.matrimony;

import static com.example.matrimony.R.color.DarkGrey;
import static com.example.matrimony.R.color.orange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class RegisterPg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_pg);
//
        getSupportActionBar().hide();
    }


    public void onback(View v)
    {
        Intent i = new Intent(this , MainActivity.class);
        startActivity(i);
    }


    public void onnext(View v)
    {
        Intent i = new Intent(this , RegisterPg2.class);
        startActivity(i);
    }

}