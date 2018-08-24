package com.vacuum.mvp3.ui.splash

import android.app.Activity
import android.content.Context
import android.os.Bundle
import com.vacuum.mvp3.ui.login.LoginActivity
import com.vacuum.mvp3.ui.main.MainActivity
import android.content.Intent




class SplashActivity : Activity(),SplashMvpView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }









    fun getStartIntent(context: Context): Intent {
        return Intent(context, SplashActivity::class.java)
    }



    override fun openMainActivity() {
        val intent = MainActivity.getStartIntent(this)
        startActivity(intent)
        finish()
    }
    override fun openLoginActivity() {
        val intent = LoginActivity.getStartIntent(this)
        startActivity(intent)
        finish()
    }



}