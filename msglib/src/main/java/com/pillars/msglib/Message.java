package com.pillars.msglib;

import android.content.Context;
import android.widget.Toast;

public class Message {


    public static void showMsg(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }


}
