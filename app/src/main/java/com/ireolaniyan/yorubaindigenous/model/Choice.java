package com.ireolaniyan.yorubaindigenous.model;

/**
 * Created by Ire Olaniyan on 12/13/2016.
 */
public class Choice {
    private String mText;
    private int mNextPage;
    private int mPreviousPage;

    public Choice(String text, int nextPage){
        mText = text;
        mNextPage = nextPage;
    }

    public Choice(String text, int nextPage, int previousPage){
        mText = text;
        mNextPage = nextPage;
        mPreviousPage = previousPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

    public int getPreviousPage() {
        return mPreviousPage;
    }

    public void setPreviousPage(int previousPage) {
        mPreviousPage = previousPage;
    }
}
