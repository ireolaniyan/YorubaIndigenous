package com.ireolaniyan.yorubaindigenous.model;

/**
 * Created by Ire Olaniyan on 12/13/2016.
 */
public class Page {
    private int mImageId;
    private String mText;
    private Choice mChoice;
    private boolean mIsFinal = false;

    public Page(int imageId, String text, Choice choice) {
        mImageId = imageId;
        mText = text;
        mChoice = choice;
    }

    public Page(int imageId, String text){
        mImageId = imageId;
        mText = text;
        mChoice = null;
        mIsFinal = true;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
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

    public void setChoice(Choice choice) {
        mChoice = choice;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setFinal(boolean aFinal) {
        mIsFinal = aFinal;
    }
}
