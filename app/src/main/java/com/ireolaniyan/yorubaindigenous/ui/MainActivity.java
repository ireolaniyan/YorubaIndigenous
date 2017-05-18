package com.ireolaniyan.yorubaindigenous.ui;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.ireolaniyan.yorubaindigenous.R;

public class MainActivity extends AppCompatActivity {

//    TODO: swipe up instead of StartButton
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartButton = (Button) findViewById(R.id.startButton);

        if (mStartButton != null) {
            mStartButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startFacts();
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

    @Override
    protected void onResume() {
        super.onResume();
    }
}
