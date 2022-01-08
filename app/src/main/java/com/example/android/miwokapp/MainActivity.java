package com.example.android.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView number;
     TextView color;
     TextView familyMember;
     TextView phrases;

     
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=(TextView)findViewById(R.id.number_id);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),NumbersActivity.class);
                startActivity(i);
            }
        });
        color=(TextView)findViewById(R.id.color_id);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Color.class);
                startActivity(i);
            }
        });
        familyMember=(TextView)findViewById(R.id.familyMember_id);
        familyMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),FamilyMember.class);
                startActivity(i);
            }
        });
        phrases=(TextView)findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(getApplicationContext(),Phrases.class);
                startActivity(i);
            }
        });

    }
}