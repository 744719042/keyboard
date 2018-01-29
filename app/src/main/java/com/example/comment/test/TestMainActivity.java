package com.example.comment.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.comment.KeyboardUtils;
import com.example.comment.R;

public class TestMainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button testHidePan;
    private Button testVisiblePan;
    private Button testHideResize;
    private Button testVisibleResize;

    private Button testHideFromWindow;
    private Button testHideFromInput;
    private EditText test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_main);
        testHidePan = (Button) findViewById(R.id.testHidePan);
        testHidePan.setOnClickListener(this);
        testVisiblePan = (Button) findViewById(R.id.testVisiblePan);
        testVisiblePan.setOnClickListener(this);
        testHideResize = (Button) findViewById(R.id.testHideResize);
        testHideResize.setOnClickListener(this);
        testVisibleResize = (Button) findViewById(R.id.testVisibleResize);
        testVisibleResize.setOnClickListener(this);

        testHideFromWindow = (Button) findViewById(R.id.testHideFromWindow);
        testHideFromWindow.setOnClickListener(this);
        testHideFromInput = (Button) findViewById(R.id.testHideFromInput);
        testHideFromInput.setOnClickListener(this);
        test = (EditText) findViewById(R.id.test);
    }

    @Override
    public void onClick(View v) {
        if (v == testHidePan) {
            Intent intent = new Intent(this, HidePanActivity.class);
            startActivity(intent);
        } else if (v == testVisiblePan) {
            Intent intent = new Intent(this, VisiblePanActivity.class);
            startActivity(intent);
        } else if (v == testHideResize) {
            Intent intent = new Intent(this, HideResizeActivity.class);
            startActivity(intent);
        } else if (v == testVisibleResize) {
            Intent intent = new Intent(this, VisibleResizeActivity.class);
            startActivity(intent);
        } else if (v == testHideFromWindow) {
            KeyboardUtils.hideSoftInputFromWindow(test);
        } else if (v == testHideFromInput) {
            KeyboardUtils.hideSoftInput(test);
        }
    }
}
