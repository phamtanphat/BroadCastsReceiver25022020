package com.example.broadcastreceiver25022020;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class MyBroadCastListenerConnect extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null){
            if (networkInfo.getType() == ConnectivityManager.TYPE_MOBILE){
                Toast.makeText(context, "Da ket noi voi 3g", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(context, "Ban khong co 3g", Toast.LENGTH_SHORT).show();
            }
            if (networkInfo.getType() == ConnectivityManager.TYPE_WIFI){
                Toast.makeText(context, "Da ket noi voi wifi", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(context, "Ban khong wifi", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(context, "Ban khong co ket noi", Toast.LENGTH_SHORT).show();
        }
    }
}
