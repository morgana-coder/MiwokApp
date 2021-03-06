package com.example.android.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<Word>list=new ArrayList<Word>();
        list.add(new Word("minto wuksus","Where are you going?",R.raw.phrase_where_are_you_going));
        list.add(new Word("tinnә oyaase'nә","What is your name?",R.raw.phrase_what_is_your_name));
        list.add(new Word("oyaaset","My name is...",R.raw.phrase_my_name_is));
        list.add(new Word("michәksәs?","How are you feeling?",R.raw.phrase_how_are_you_feeling));
        list.add(new Word("kuchi achit","I’m feeling good.",R.raw.phrase_im_feeling_good));
        list.add(new Word("әәnәs'aa?","Are you coming?",R.raw.phrase_are_you_coming));
        list.add(new Word("hәә’ әәnәm","Yes, I’m coming.",R.raw.phrase_yes_im_coming));
        list.add(new Word("әәnәm","I’m coming.",R.raw.phrase_im_coming));
        list.add(new Word("yoowutis","Let’s go.",R.raw.phrase_lets_go));
        list.add(new Word("әnni'nem","Come here.",R.raw.phrase_come_here));
        WordAdaptor itemsAdapter =  new WordAdaptor(this, list);
        ListView listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);


    }
}