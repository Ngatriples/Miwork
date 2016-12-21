package com.example.android.miwok;

/**
 * Created by laptop88 on 12/11/2016.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiworkTranslation;
    private int mImageResourcesID;
    private int mAudioResourcesID;
    static  final int  noImageProvide=-1;
    public  Word(String defaultTranslation,String miworkTranslation ,int resrcAudio)
    {
        mDefaultTranslation=defaultTranslation;
        mMiworkTranslation=miworkTranslation;
        mAudioResourcesID=resrcAudio;
    }
    public  Word(String defaultTranslation,String miworkTranslation ,int resrcImg ,int resrcAudio )
    {
        mDefaultTranslation=defaultTranslation;
        mMiworkTranslation=miworkTranslation;
        mImageResourcesID=resrcImg;
        mAudioResourcesID=resrcAudio;
    }
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public int getDefaultImg()
    {
        return mImageResourcesID;
    }
    public String getMiworkTranslation()
    {
        return  mMiworkTranslation;
    }
    public int getmAudioResourcesID()
    {
        return  mAudioResourcesID;
    }
    public  boolean hasImage(){return mImageResourcesID!=noImageProvide;}

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiworkTranslation='" + mMiworkTranslation + '\'' +
                ", mImageResourcesID=" + mImageResourcesID +
                ", mAudioResourcesID=" + mAudioResourcesID +
                '}';
    }
}
