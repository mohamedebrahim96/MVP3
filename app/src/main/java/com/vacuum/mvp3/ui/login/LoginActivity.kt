package com.vacuum.mvp3.ui.login

import android.content.Context
import android.content.Intent



class LoginActivity {

    fun getStartIntent(context: Context): Intent {
        return Intent(context, LoginActivity::class.java)
    }

}
