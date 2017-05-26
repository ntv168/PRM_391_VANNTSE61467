package com.example.sam.prm_391.Activities_Intent;

import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sam.prm_391.R;

public class ChildActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction();
        }
    }

    public void clickToBackCaller(View view) {
        finish();
    }
}
