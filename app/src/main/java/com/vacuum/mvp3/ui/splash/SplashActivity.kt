package com.vacuum.mvp3.ui.splash

import android.app.Activity
import android.content.Context
import android.os.Bundle
import com.vacuum.mvp3.ui.login.LoginActivity
import com.vacuum.mvp3.ui.main.MainActivity
import android.content.Intent
import com.vacuum.mvp3.MvpApp
import com.vacuum.mvp3.data.DataManager
import com.vacuum.mvp3.MvpApp
import com.vacuum.mvp3.R
import com.vacuum.mvp3.data.DataManager








class SplashActivity : Activity(),SplashMvpView {

    var mSplashPresenter: SplashPresenter<SplashMvpView>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val dataManager = (application as MvpApp).dataManager

        mSplashPresenter = SplashPresenter(dataManager)

        mSplashPresenter?.onAttach(this)

        mSplashPresenter?.decideNextActivity()
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