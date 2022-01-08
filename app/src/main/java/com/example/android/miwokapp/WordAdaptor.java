package com.example.android.miwokapp;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdaptor extends ArrayAdapter<Word> {
    MediaPlayer mediaPlayer;
    public WordAdaptor(Activity context, ArrayList<Word>list)
    {
        super(context,0,list);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word language = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok);
        nameTextView.setText(language.getMiwokWord());
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.english);
        numberTextView.setText(language.getEnglishWord());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        if(iconView==null)
        iconView.setVisibility(View.GONE);
        else {
            iconView.setVisibility(View.VISIBLE);
            iconView.setImageResource(language.getImageResourceId());
        }

        ImageButton play=(ImageButton) listItemView.findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Playing sound",Toast.LENGTH_SHORT).show();
                mediaPlayer=MediaPlayer.create(getContext(),language.getAudioResouceId());
                mediaPlayer.start();
            }
        });
        return listItemView;
    }
}
