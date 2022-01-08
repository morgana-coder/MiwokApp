package com.example.android.miwokapp;

public class Word {
    private String miwokWord;
    private String englishWord;
    private int imageResourceId;
    private  int audioResouceId;

    public Word(String miwokWord, String englishWord,int imageResourceId,int audioResouceId) {
        this.miwokWord = miwokWord;
        this.englishWord = englishWord;
        this.imageResourceId=imageResourceId;
        this.audioResouceId=audioResouceId;
    }
    public  Word(String miwokWord,String englishWord,int audioResouceId)
    {
        this.miwokWord = miwokWord;
        this.englishWord = englishWord;
        this.audioResouceId=audioResouceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public  int getAudioResouceId(){ return  audioResouceId; }
}
