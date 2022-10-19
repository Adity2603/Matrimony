package com.example.matrimony;

import static com.example.matrimony.R.color.DarkGrey;
import static com.example.matrimony.R.color.DarkRed;
import static com.example.matrimony.R.color.PersianBlue;
import static com.example.matrimony.R.color.orange;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.matrimony.ui.gallery.GalleryFragment;
import com.example.matrimony.ui.home.HomeFragment;

public class Login extends AppCompatActivity {

    Button logbtn ;
    EditText loge , logp;
    database g;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(DarkRed)));

        loge = findViewById(R.id.loge);
        logp = findViewById(R.id.logp);
        logbtn = findViewById(R.id.logbtn);
        g = new database(this );

        logbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = loge.getText().toString();
                String password = logp.getText().toString();
                if (email.equals("")||password.equals(""))
                {
                    Toast.makeText(Login.this, "Please Fill Login Crediantials ", Toast.LENGTH_SHORT).show();
                }
                else {
                    
                    Boolean i = g.checklogin(email, password);
                    if (i == true) 
                    {
                        Intent r = new Intent(Login.this , List.class);
                        startActivity(r);

                        Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        

                    }
                    else
                    {
                        Toast.makeText(Login.this, "INvalid Crediantials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });





    }

    public void onsignup(View v)
    {
        Intent i = new Intent(this ,RegisterPg.class);
        startActivity(i);
    }


//    public void onbtn(View v)
//    {
//        Intent i = new Intent(this , List.class);
//        startActivity(i);
//    }





}