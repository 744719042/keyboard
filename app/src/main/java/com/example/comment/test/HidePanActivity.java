package com.example.comment.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.comment.R;

public class HidePanActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hide_pan);
        submit = (TextView) findViewById(R.id.comment_submit);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, NavigatorActivity.class);
        startActivity(intent);
    }
}
