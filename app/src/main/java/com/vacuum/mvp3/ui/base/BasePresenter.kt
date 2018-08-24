package com.vacuum.mvp3.ui.base

import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import com.vacuum.mvp3.data.DataManager


open class BasePresenter<V : MvpView>(dataManager: DataManager) : MvpPresenter<V> {

    var mvpView: V? = null
        private set

    var dataManager: DataManager
        internal set


    init {
        this.dataManager = dataManager
    }

    override fun onAttach(mvpView: V) {
        this.mvpView = mvpView
    }


}