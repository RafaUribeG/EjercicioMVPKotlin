package com.example.ejerciciomvpkotlin.interfaces

interface LoginView {
    fun exito()
    fun noExite()
    fun setErrorUser()
    fun setErrorPassword()
    fun mostrarProgreso()
    fun esconderProgreso()
}