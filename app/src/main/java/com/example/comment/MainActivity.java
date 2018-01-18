package com.example.comment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements KeyBoardLayout.KeyBoardListener {
    private static final String TAG = "MainActivity";

    private KeyBoardLayout keyBoardLayout;
    private HintPopupWindow hintPopupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        keyBoardLayout = (KeyBoardLayout) findViewById(R.id.key_board_layout);
        keyBoardLayout.setOnKeyBoardShow(this);
        hintPopupWindow = new HintPopupWindow(this);
    }

    public void onKeyBoardShow(final int keyBoardHeight) {
        Log.d(TAG, "onKeyBoardShow(): keyBoardHeight = " + keyBoardHeight);
        getWindow().getDecorView().postDelayed(new Runnable() {
            @Override
            public void run() {
                hintPopupWindow.show(getWindow().getDecorView(), 0,
                        CommonUtils.getScreenHeight() - keyBoardHeight - hintPopupWindow.getHeight());
            }
        }, 100);
    }

    @Override
    public void onKeyBoardEvent(boolean active, int keyBoardHeight) {
        if (active) {
            onKeyBoardShow(keyBoardHeight);
        } else {
            onKeyBoardHide(keyBoardHeight);
        }
    }

    private void onKeyBoardHide(int keyBoardHeight) {
        hintPopupWindow.hide();
    }
}
