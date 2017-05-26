package com.example.sam.prm_391.Notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sam.prm_391.R;

public class NotificationMain extends AppCompatActivity {

    Button btn_StartNotifiction;
    Button btn_UpdateNotifiction;
    Button btn_CancelNotifiction;
    Button btn_startMultiple;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_main);

        btn_StartNotifiction = (Button) findViewById(R.id.btn_StartNotifiction);
        btn_UpdateNotifiction = (Button) findViewById(R.id.btn_UpdateNotifiction);
        btn_CancelNotifiction = (Button) findViewById(R.id.btn_CancelNotifiction);
        btn_startMultiple = (Button) findViewById(R.id.btn_startMultiple);

        btn_StartNotifiction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNotification();
            }
        });

    }

    public void startNotification() {
        Notification.Builder builder = new Notification.Builder(this);
        builder.setSmallIcon(R.drawable.ic_launcher)
                .setContentTitle("Notification")
                .setContentText("This is a message");

        Intent intent = new Intent(this, NotificationSecond.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0, intent, PendingIntent.FLAG_UPDATE_CURRENT );
        builder.setContentIntent(pendingIntent);

        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());


    }
}
