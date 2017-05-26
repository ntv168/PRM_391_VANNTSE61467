package com.example.sam.prm_391.Activities_Intent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sam.prm_391.R;

public class IntentDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo);
    }

    public void clicktoCallotherActivity(View view){
        startActivity(new Intent(IntentDemo.this,ChildActivity.class));
    }

    public  void addtwodouble(View view) {
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);

        Double double1 = Double.parseDouble(num1.getText()+"");
        Double double2 = Double.parseDouble(num2.getText()+"");

        Intent intent = new Intent(IntentDemo.this, ResultActivity.class);
        Bundle bundle = new Bundle();
        bundle.putDouble("result", double1 + double2);
        intent.putExtra("info" ,bundle);
        startActivity(intent);

    }

    public void clicktoStartBrowser(View view) {
        Uri uri = Uri.parse("http://google.com.vn");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void clicktoStartPhone(View view) {
        Uri uri = Uri.parse("tel:01246789111");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);
    }

    public void clicktoStartBrowerLaunch(View view) {
        Uri uri = Uri.parse("http://google.com.vn");
        Intent intent = new Intent(".Activities_Intent.IntentDemo", uri);
        startActivity(intent);
    }

    public void clicktoGetException(View view) {
        Uri uri = Uri.parse("http://google.com.vn");
        Intent intent = new Intent(".Activities_Intent.IntentDemo", uri);
        startActivity(intent);
    }

    public void clickToSendSMS(View view) {
        Intent intent = new Intent(IntentDemo.this, SendSMSActivity.class);
        startActivity(intent);
    }
}
