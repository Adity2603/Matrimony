package com.example.matrimony;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

    //    database g = new database(this );
      //  SQLiteDatabase db = g.getReadableDatabase();



    }

    public void onlogin(View v)
    {
        Intent i = new Intent(this , Login.class);
        startActivity(i);
    }

    public void onsignup(View v)
    {
        Intent i = new Intent(this , RegisterPg.class);
        startActivity(i);
    }


}