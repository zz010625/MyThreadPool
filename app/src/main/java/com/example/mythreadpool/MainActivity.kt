package com.example.mythreadpool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var number = 0
        ThreadPoolManager.setMode(ThreadPoolManager.ThreadPoolMode.SINGLETHREADPOOL)
            .setTaskNumber(30).setRunnable(
                Runnable {
                    Thread.sleep(2000)
                    Log.d("number", number.toString())
                    number++
                }
            ).start()

    }
}