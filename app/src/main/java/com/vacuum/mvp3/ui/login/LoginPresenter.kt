package com.vacuum.mvp3.ui.login

import com.vacuum.mvp3.data.DataManager
import com.vacuum.mvp3.ui.base.BasePresenter

class LoginPresenter<V : LoginMvpView>(dataManager: DataManager) : BasePresenter<V>(dataManager), LoginMvpPresenter<V> {

    override fun startLogin(emailId: String) {
        dataManager.saveEmailId(emailId)
        dataManager.setLoggedIn()
        mvpView!!.openMainActivity()
    }

}