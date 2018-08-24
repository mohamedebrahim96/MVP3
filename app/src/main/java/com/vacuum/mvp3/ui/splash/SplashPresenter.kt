package com.vacuum.mvp3.ui.splash

import com.vacuum.mvp3.data.DataManager
import com.vacuum.mvp3.ui.base.BasePresenter


open class SplashPresenter<V : SplashMvpView>(dataManager: DataManager) : BasePresenter<V>(dataManager), SplashMvpPresenter<V> {

    override fun decideNextActivity() {
        if (dataManager.getLoggedInMode()!!) {
            mvpView?.openMainActivity()
        } else {
            mvpView?.openLoginActivity()
        }
    }
}