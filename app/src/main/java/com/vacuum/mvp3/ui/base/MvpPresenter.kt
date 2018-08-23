package com.vacuum.mvp3.ui.base

interface MvpPresenter<V : MvpView> {

    fun onAttach(mvpView: V)

}