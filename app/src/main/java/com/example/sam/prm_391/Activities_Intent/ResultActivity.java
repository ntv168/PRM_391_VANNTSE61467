package com.example.sam.prm_391.Activities_Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.sam.prm_391.R;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle bundle = getIntent().getBundleExtra("info");
        TextView textView = (TextView) findViewById(R.id.resultadd);
        textView.setText(bundle.getDouble("result") + "");
    }

    public void clickToBackCaller(View view) {
        finish();
    }
}
