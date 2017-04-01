package com.ireolaniyan.yorubaindigenous.model;

/**
 * Created by ire on 4/1/17.
 */

public class Back {
    private int mPreviousPage;

    Back(){
        mPreviousPage = 0;
    }

    Back(int previousPage){
        mPreviousPage = previousPage;
    }

    public int getPreviousPage() {
        return mPreviousPage;
    }

}
