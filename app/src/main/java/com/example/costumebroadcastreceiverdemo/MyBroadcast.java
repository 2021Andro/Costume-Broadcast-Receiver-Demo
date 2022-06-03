package com.example.costumebroadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        String packageName = "com.example.costumebroadcastreceiverdemo.EXAMPLE_ACTION";

        if (packageName.equals(intent.getAction()))
        {

            String massage = intent.getStringExtra("com.example.costumebroadcastreceiverdemo.EXTRA_TEXT");

            Toast.makeText(context, "Main Application "+massage, Toast.LENGTH_SHORT).show();


        }

    }
}
