package com.ireolaniyan.yorubaindigenous.ui;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.ireolaniyan.yorubaindigenous.R;

public class MainActivity extends AppCompatActivity {

//    private EditText mNameField;
//    TODO: swipe up instead of StartButton
    private Button mStartButton;
//    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mNameField = (EditText) findViewById(R.id.nameEditText);
        mStartButton = (Button) findViewById(R.id.startButton);
//        mImageView = (ImageView) findViewById(R.id.titleImageView);

        if (mStartButton != null) {
            mStartButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    /*Slide slide = new Slide();
                    slide.setSlideEdge(Gravity.TOP);
                    ViewGroup root = (ViewGroup) findViewById(R.id.titleImageView);
                    TransitionManager.beginDelayedTransition(root, slide);
                    mImageView.setVisibility(View.INVISIBLE);*/

                    mStartButton.animate()
                            .alpha(0f)
                            .translationY(-mStartButton.getHeight())
                            .setDuration(getResources().getInteger(android.R.integer.config_shortAnimTime))
                            .withEndAction(new Runnable() {
                                @Override
                                public void run() {
                                    startFacts();
                                }
                            });
                }
            });
        }
    }

    private void startFacts(){
        Intent intent = new Intent(this, FactsActivity.class);
//        intent.putExtra(getString(R.string.key_name), name);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(intent, bundle);
        }
        else {
            startActivity(intent);
        }
    }
}
