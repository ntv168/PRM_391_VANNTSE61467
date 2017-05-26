package com.example.sam.prm_391.SdlingDrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SlidingDrawer;

import com.example.sam.prm_391.R;

public class Sliding_drawer extends AppCompatActivity {
    private int status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_drawer);
    }

    public  void clicktoHorizantal(View view){
        Intent intent = new Intent(this,ActivityHorizontal.class);
        startActivity(intent);
    }

    public void clicktoChangeDirection(View view) {
        if(status == 0) {

        }
    }
}
