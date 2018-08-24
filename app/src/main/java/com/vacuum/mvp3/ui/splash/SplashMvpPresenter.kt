package com.vacuum.mvp3.ui.splash

import com.vacuum.mvp3.ui.base.MvpPresenter


interface SplashMvpPresenter<V : SplashMvpView> : MvpPresenter<V> {

    fun decideNextActivity()

}