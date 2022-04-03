package com.example.ejerciciomvpkotlin.presenter


import com.example.ejerciciomvpkotlin.interfaces.LoginInteractor
import com.example.ejerciciomvpkotlin.interfaces.LoginPresenter
import com.example.ejerciciomvpkotlin.interfaces.LoginView
import com.example.ejerciciomvpkotlin.view.Login


class LoginPresenterImpl(login: Login) :LoginPresenter {

    lateinit var vista:LoginView
    lateinit var interactor:LoginInteractor

    override fun validarUsuario(user: String?, pass: String?) {
        if (vista != null){
            vista.mostrarProgreso()

        }
        if (user != null) {
            if (pass != null) {
                interactor.validarUsuario(user, pass, this)
            }
        }

    }

    override fun setErrorUser() {
        if (vista != null){
            vista.esconderProgreso();
            vista.setErrorUser();
        }
    }

    override fun setErrorPassword() {
        if (vista != null){
            vista.esconderProgreso();
            vista.setErrorPassword();
        }
    }

    override fun exito() {
        if (vista != null){
            vista.esconderProgreso();
            vista.exito();
        }
    }

    override fun noExiste() {
        if (vista != null){
            vista.esconderProgreso();
            vista.noExite();
        }
    }

}