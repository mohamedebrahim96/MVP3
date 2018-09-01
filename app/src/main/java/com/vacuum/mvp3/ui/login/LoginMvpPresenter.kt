package com.vacuum.mvp3.ui.login

import com.vacuum.mvp3.ui.base.MvpPresenter
import android.icu.lang.UCharacter.GraphemeClusterBreak.V



interface LoginMvpPresenter <V:LoginMvpView> : MvpPresenter<V> {

    fun startLogin(emailId: String)

}