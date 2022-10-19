package com.example.matrimony;

import static com.example.matrimony.R.color.DarkRed;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;

public class RegisterPg2 extends AppCompatActivity  {

    EditText date ;
    database g;
    EditText e1,e2,e3,e4,edu , mob ;
    Button b1 ;
    Spinner staticSpinner;
    Spinner spinner ;








    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_pg2);


        g = new database(this );
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        e4=findViewById(R.id.e4);
        b1=findViewById(R.id.b1);
        date = findViewById(R.id.date);
        edu = findViewById(R.id.edu);
        mob = findViewById(R.id.mob);
        staticSpinner = findViewById(R.id.static_spinner);
        spinner = findViewById(R.id.lang);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = e1.getText().toString();
                String last = e2.getText().toString();
                String birth = date.getText().toString();
                String education = edu.getText().toString();
                String religion = staticSpinner.toString();
                String lang = spinner.toString();
                String mobile = mob.getText().toString();
                String email= e4.getText().toString();
                String pass = e3.getText().toString();



                if (first.equals("")||last.equals("")||birth.equals("")||education.equals("")||religion.equals("")||lang.equals("")||mobile.equals("")||email.equals("")||pass.equals(""))
                {

                    Toast.makeText(RegisterPg2.this, "Please Enter all Fields", Toast.LENGTH_SHORT).show();
                    
                    
                }


                else
                {
                 //  Boolean i= g.insert_data(first , last , pass,email);

//                   if (i=true)
//                       Toast.makeText(RegisterPg2.this, "Data Inserted", Toast.LENGTH_SHORT).show();
//                   else
//                       Toast.makeText(RegisterPg2.this, "Data Not Inserted", Toast.LENGTH_SHORT).show();
                    Boolean i = g.checkemail(email);
                    if (i==true)

                    {

                        Toast.makeText(RegisterPg2.this, "Email already Registerd", Toast.LENGTH_SHORT).show();



                    }

                    else
                    {

                        Boolean r = g.insert_data(first , last , birth,education,religion ,lang , mobile , email , pass);
                        if (r==true)
                        {
                            Toast.makeText(RegisterPg2.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                            Intent ir = new Intent(RegisterPg2.this , Login.class);
                            startActivity(ir);

                        }
                        
                        else
                            Toast.makeText(RegisterPg2.this, "Rgistration Not Successful", Toast.LENGTH_SHORT).show();

                    }



                }

            }
        });





//        getSupportActionBar().hide();
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(DarkRed)));

       // date = findViewById(R.id.date);
        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        RegisterPg2.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                        month=month+1;
                        String date2 = day+"/"+month+"/"+year;
                        date.setText(date2);
                    }
                },year,month,day
                );
                datePickerDialog.show();
            }
        });




        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter
                .createFromResource(this, R.array.cast,
                        android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        staticAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        staticSpinner.setAdapter(staticAdapter);

  //  ***********************************************************************



        Spinner lang = (Spinner) findViewById(R.id.lang);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter
                .createFromResource(this, R.array.toung,
                        android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);






    }




}











