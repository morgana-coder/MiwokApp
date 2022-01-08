package com.example.android.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Color extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        ArrayList<Word>color= new ArrayList<Word>();
        color.add(new Word("weṭeṭṭi","red",R.drawable.color_red,R.raw.color_red));
        color.add(new Word("chokokki","green",R.drawable.color_green,R.raw.color_green));
        color.add(new Word("ṭakaakki","brown",R.drawable.color_brown,R.raw.color_brown));
        color.add(new Word("ṭopoppi","gray",R.drawable.color_green,R.raw.color_gray));
        color.add(new Word("kululli","black",R.drawable.color_black,R.raw.color_black));
        color.add(new Word("kelelli","white",R.drawable.color_white,R.raw.color_white));
        color.add(new Word("ṭopiisә","dusty yellow",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        color.add(new Word("chiwiiṭә","mustard yellow",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
        WordAdaptor itemsAdapter =  new WordAdaptor(this, color);
        ListView listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);



    }
}