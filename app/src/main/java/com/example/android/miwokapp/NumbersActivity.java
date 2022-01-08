package com.example.android.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<Word>list=new ArrayList <Word>();
        list.add(new Word("lutti","one",R.drawable.number_one,R.raw.number_one));
        list.add(new Word("otiiko","two",R.drawable.number_two,R.raw.number_two));
        list.add(new Word("tolookosu","three",R.drawable.number_three,R.raw.number_three));
        list.add(new Word("oyyisa","four",R.drawable.number_four,R.raw.number_four));
        list.add(new Word("massokka","five",R.drawable.number_five,R.raw.number_five));
        list.add(new Word("temmokka","six",R.drawable.number_six,R.raw.number_six));
        list.add(new Word("kenekaku","seven",R.drawable.number_seven,R.raw.number_seven));
        list.add(new Word("kawinta","eight",R.drawable.number_eight,R.raw.number_eight));
        list.add(new Word("wo’e","nine",R.drawable.number_nine,R.raw.number_nine));
        list.add(new Word("na’aacha","ten",R.drawable.number_ten,R.raw.number_ten));
        WordAdaptor itemsAdapter =  new WordAdaptor(this, list);
        ListView listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);





    }
}