package com.example.ejerciciomvpkotlin.interfaces

interface LoginPresenter {
    fun validarUsuario(user: String?, pass: String?)
    fun setErrorUser()
    fun setErrorPassword()
    fun exito()
    fun noExiste()
}