package com.example.jefferson.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class UserPresentBroadcastReceiver extends BroadcastReceiver {

    private static final String TAG = UserPresentBroadcastReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG, "onReceive: USER_PRESENT");
    }
}
