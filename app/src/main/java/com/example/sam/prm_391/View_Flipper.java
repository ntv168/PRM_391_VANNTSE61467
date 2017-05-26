package com.example.sam.prm_391;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

public class View_Flipper extends AppCompatActivity {

    private boolean status = false;
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_flipper);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewflipper);

        status = false;

    }

    public void next(View view) {
        viewFlipper.showNext();
        viewFlipper.setInAnimation(this,R.anim.left_in);
        viewFlipper.setInAnimation(this,R.anim.left_out);
    }

    public void previous(View view) {
        viewFlipper.showPrevious();
    }

    public void auto(View view) {
        if (!status) {
            viewFlipper.setAutoStart(true);
            viewFlipper.setFlipInterval(500);
            viewFlipper.startFlipping();

        }
    }
}
