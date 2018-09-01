package com.vacuum.mvp3.ui.login

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.vacuum.mvp3.MvpApp
import com.vacuum.mvp3.R
import com.vacuum.mvp3.ui.main.MainActivity
import com.vacuum.mvp3.util.CommonUtils
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity:Activity(),LoginMvpView {

    var  loginPresenter:LoginPresenter<LoginMvpView>?=  null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val datamangeer = (application as MvpApp).dataManager
        loginPresenter = LoginPresenter(datamangeer)
        loginPresenter?.onAttach(this)

        button.setOnClickListener {
            onLoginButtonClick()
        }

    }

    override fun openMainActivity() {
        val i = MainActivity().getStartIntent(this)
        startActivity(i)
        finish()
    }

    override fun onLoginButtonClick() {
        val emailId = editTextEmail.text.toString()
        val password = editTextPassword.text.toString()

        if (!CommonUtils().isEmailValid(emailId)) {
            Toast.makeText(this, "Enter correct Email", Toast.LENGTH_LONG).show()
            return
        }

        if (password == null || password.isEmpty()) {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_LONG).show()
            return
        }

        loginPresenter?.startLogin(emailId)


    }

    fun getStartIntent(context: Context): Intent {
        return Intent(context, LoginActivity::class.java)
    }

}
