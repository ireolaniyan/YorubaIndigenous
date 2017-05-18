package com.ireolaniyan.yorubaindigenous.model;

/**
 * Created by Ire Olaniyan on 12/13/2016.
 */
public class Page {
    private int mImageId;
    private String mText;
    private Choice mChoice;
    private Back mBack;
    private boolean mIsFinal = false;

    public Page(int imageId, String text, Choice choice, Back back) {
        mImageId = imageId;
        mText = text;
        mChoice = choice;
        mBack = back;
    }

//    Overloaded constructor for last array index that doesn't have a "Choice".
    public Page(int imageId, String text, Back back){
        mImageId = imageId;
        mText = text;
        mBack = back;
        mChoice = null;
        mIsFinal = true;
    }

    public int getImageId() {
        return mImageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice() {
        return mChoice;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setFinal(boolean aFinal) {
        mIsFinal = aFinal;
    }

    public Back getBack() {
        return mBack;
    }

    public void setBack(Back back) {
        mBack = back;
    }
}
