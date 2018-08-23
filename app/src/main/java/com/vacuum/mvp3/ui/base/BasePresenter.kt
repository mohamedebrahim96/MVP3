package com.vacuum.mvp3.ui.base

import com.vacuum.mvp3.data.DataManager


class BasePresenter<V : MvpView>(dataManager: DataManager) : MvpPresenter<V> {

    var mvpView: V? = null
        private set



    override fun onAttach(mvpView: V) {
        this.mvpView = mvpView
    }
}