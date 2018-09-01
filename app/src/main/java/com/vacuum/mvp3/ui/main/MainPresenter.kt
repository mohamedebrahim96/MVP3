package com.vacuum.mvp3.ui.main

import com.vacuum.mvp3.data.DataManager
import com.vacuum.mvp3.ui.base.BasePresenter

class MainPresenter<V:MainMvpView>(dataManager: DataManager): BasePresenter<V>(dataManager),MainMvpPresenter<V>{

    override fun getEmailId(): String {
        return dataManager.getEmailId().toString()
    }

    override fun setUserLoggedOut() {
        dataManager.clear()
        mvpView?.openSplashActivity()
    }


}