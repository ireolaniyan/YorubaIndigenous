package com.ireolaniyan.yorubaindigenous.ui;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.ireolaniyan.yorubaindigenous.R;
import com.ireolaniyan.yorubaindigenous.model.Facts;
import com.ireolaniyan.yorubaindigenous.model.Page;

public class FactsActivity extends AppCompatActivity {

    private Facts mFact = new Facts();
    private ImageView mImageView;
    private TextView mTextView;
    private Button mChoice;
    private Page mCurrentPage;
    private long slideDuration = 300;
    private ImageButton mBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Slide slide = new Slide(Gravity.BOTTOM);
            slide.addTarget(R.id.factTextView);
            slide.setInterpolator(AnimationUtils.loadInterpolator(this, android.R.interpolator.linear_out_slow_in));
            slide.setDuration(slideDuration);
            getWindow().setEnterTransition(slide);
        }

        mImageView = (ImageView) findViewById(R.id.factImageView);
        mTextView = (TextView) findViewById(R.id.factTextView);
        mChoice = (Button) findViewById(R.id.choiceButton);
        mBackButton = (ImageButton) findViewById(R.id.backButton);

        loadPage(0);

    }

    private void loadPage(int choice){
        mCurrentPage = mFact.getPage(choice);

        Drawable drawable = getResources().getDrawable(mCurrentPage.getImageId());
        mImageView.setImageDrawable(drawable);

        mTextView.setText(mCurrentPage.getText());

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int previousPage = mCurrentPage.getChoice().getPreviousPage();
                loadPage(previousPage);
            }
        });

        /*if (mBackButton.isPressed()){
            mBackButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int previousPage = mCurrentPage.getChoice().getPreviousPage();
                    loadPage(previousPage);
                }
            });
        }*/

        if (mCurrentPage.isFinal()){
            mChoice.setText(R.string.finalButton);
            mChoice.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
        else{
            mChoice.setText(mCurrentPage.getChoice().getText());

            mChoice.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mCurrentPage.getChoice().getNextPage();
                    loadPage(nextPage);
                }
            });
        }


    }
}
