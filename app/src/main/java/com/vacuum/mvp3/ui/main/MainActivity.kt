package com.vacuum.mvp3.ui.main

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.vacuum.mvp3.MvpApp
import com.vacuum.mvp3.R
import com.vacuum.mvp3.ui.splash.SplashActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainMvpView {

    var mainPresenter: MainPresenter<MainMvpView>?= null
    fun getStartIntent(context: Context): Intent {
        return Intent(context, MainActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data  = (application as MvpApp).dataManager
        mainPresenter = MainPresenter(data)
        mainPresenter?.onAttach(this)


        buttonLogout.setOnClickListener {
            mainPresenter?.setUserLoggedOut()
        }

    }

    override fun openSplashActivity() {
        val i = SplashActivity().getStartIntent(this)
        startActivity(i)
        finish()
    }








}
