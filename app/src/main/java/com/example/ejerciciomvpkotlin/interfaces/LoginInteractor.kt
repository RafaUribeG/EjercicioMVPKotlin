package com.example.ejerciciomvpkotlin.interfaces

import com.example.ejerciciomvpkotlin.presenter.LoginPresenterImpl

interface LoginInteractor {
    fun validarUsuario(user:String, pass:String, presenter: LoginPresenterImpl)
}