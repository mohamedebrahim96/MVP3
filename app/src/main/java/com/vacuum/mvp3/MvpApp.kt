package com.vacuum.mvp3

import com.vacuum.mvp3.data.DataManager
import com.vacuum.mvp3.data.SharedPrefsHelper
import android.app.Application


class MvpApp : Application() {

    lateinit var dataManager: DataManager
        internal set

    override fun onCreate() {
        super.onCreate()
        val sharedPrefsHelper = SharedPrefsHelper(applicationContext)
        dataManager = DataManager(sharedPrefsHelper)
    }

}