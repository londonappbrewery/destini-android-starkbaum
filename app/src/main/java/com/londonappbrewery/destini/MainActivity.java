package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button mButtonTop;
    private Button mButtonBottom;
    private TextView mTextView;
    private int mIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);
        mTextView = findViewById(R.id.storyTextView);

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mIndex == 1 || mIndex == 2) {
                    setText(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2);
                    mIndex = 3;
                } else if (mIndex == 3) {
                    mTextView.setText(R.string.T6_End);
                    hideButtons();
                }
            }
        });

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mIndex == 1) {
                    setText(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2);
                    mIndex = 2;
                } else if (mIndex == 2) {
                    mTextView.setText(R.string.T4_End);
                    hideButtons();
                } else if (mIndex == 3) {
                    mTextView.setText(R.string.T5_End);
                    hideButtons();
                }
            }
        });
    }

    private void setText(int textView, int buttonTop, int buttonBottom) {
        mTextView.setText(textView);
        mButtonTop.setText(buttonTop);
        mButtonBottom.setText(buttonBottom);
    }

    private void hideButtons() {
        mButtonTop.setVisibility(View.GONE);
        mButtonBottom.setVisibility(View.GONE);
    }
}
