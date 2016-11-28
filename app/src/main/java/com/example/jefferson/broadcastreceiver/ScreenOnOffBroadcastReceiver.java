package com.example.jefferson.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ScreenOnOffBroadcastReceiver extends BroadcastReceiver {

    private static final String TAG = ScreenOnOffBroadcastReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG, "onReceive:");
        if ( intent.getAction().equals(Intent.ACTION_SCREEN_ON) ) {
            Log.e(TAG, "SCREEN_ON");
        }else if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)){
            Log.e(TAG, "SCREEN_OFF");
        }
    }
}
