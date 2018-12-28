package com.example.a16719756.layoutcource;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class IncomingCallReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Intent serviceIntent = new Intent(context, BlockService.class);
        serviceIntent.putExtras(intent.getExtras());
        serviceIntent.setAction(intent.getAction());
        context.startService(serviceIntent);

    }

}