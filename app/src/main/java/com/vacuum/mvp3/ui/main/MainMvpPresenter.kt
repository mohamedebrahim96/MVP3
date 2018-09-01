package com.vacuum.mvp3.ui.main

import com.vacuum.mvp3.ui.base.MvpPresenter



interface MainMvpPresenter<V:MainMvpView>:MvpPresenter<V>{

    fun getEmailId(): String
    fun setUserLoggedOut()

}