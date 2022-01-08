package com.example.android.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMember extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_member);
        ArrayList<Word>fmlist=new ArrayList<Word>();
        fmlist.add(new Word("әpә","father",R.drawable.family_father,R.raw.family_father));
        fmlist.add(new Word("әṭa","mother",R.drawable.family_mother,R.raw.family_mother));
        fmlist.add(new Word("angsi","son",R.drawable.family_son,R.raw.family_son));
        fmlist.add(new Word("tune","daughter",R.drawable.family_daughter,R.raw.family_daughter));
        fmlist.add(new Word("ama","grandmother",R.drawable.family_grandmother,R.raw.family_grandmother));
        fmlist.add(new Word("paapa","grandfather",R.drawable.family_grandfather,R.raw.family_grandfather));
        fmlist.add(new Word("taachi","older brother",R.drawable.family_older_brother,R.raw.family_older_brother));
        fmlist.add(new Word("chalitti","younger brother",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        fmlist.add(new Word("teṭe","older sister",R.drawable.family_older_sister,R.raw.family_older_sister));
        fmlist.add(new Word("kolliti","younger sister",R.drawable.family_younger_sister,R.raw.family_younger_sister));

        WordAdaptor itemsAdapter =  new WordAdaptor(this, fmlist);
        ListView listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);





    }
}