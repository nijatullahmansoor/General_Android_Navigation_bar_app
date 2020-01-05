package com.example.genral;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //here we are setting the title for this
        getSupportActionBar().setTitle("Third Activiy");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //now we should define the parent activity name
        //to do this go to the Manisfests file and define the parent activity


    }
}
