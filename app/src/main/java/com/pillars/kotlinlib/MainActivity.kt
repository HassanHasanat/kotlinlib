package com.pillars.kotlinlib

import android.os.Bundle
 import androidx.appcompat.app.AppCompatActivity
import com.pillars.msglib.Message.showMsg

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showMsg(applicationContext, "hello lib")


    }
}