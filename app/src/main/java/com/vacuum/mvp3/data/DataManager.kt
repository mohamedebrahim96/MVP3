package com.vacuum.mvp3.data

class DataManager(var mSharedPrefsHelper:SharedPrefsHelper) {


    fun clear(){
        mSharedPrefsHelper.clear()
    }
    fun saveEmailId(Email:String){
        mSharedPrefsHelper.putEmail(Email)
    }
    fun getEmailId(): String? {
        return mSharedPrefsHelper.email
    }

    fun setLoggedIn() {
        mSharedPrefsHelper.loggedInMode = true
    }

    fun getLoggedInMode(): Boolean? {
        return mSharedPrefsHelper.loggedInMode
    }
}
