package com.vacuum.mvp3.ui.main

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.vacuum.mvp3.R

class MainActivity : AppCompatActivity() {

    fun getStartIntent(context: Context): Intent {
        return Intent(context, MainActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}
