package com.vacuum.mvp3.ui.login

import com.vacuum.mvp3.ui.base.MvpPresenter



interface LoginMvpPresenter <V:LoginMvpView> : MvpPresenter<V> {

    fun startLogin(emailId: String)

}