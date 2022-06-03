package com.example.costumebroadcastreceiverdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private MyBroadcast myBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String packageName = "com.example.costumebroadcastreceiverdemo.EXAMPLE_ACTION";

        myBroadcast = new MyBroadcast();

        IntentFilter filter = new IntentFilter(packageName);

        registerReceiver(myBroadcast, filter);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        unregisterReceiver(myBroadcast);

    }
}