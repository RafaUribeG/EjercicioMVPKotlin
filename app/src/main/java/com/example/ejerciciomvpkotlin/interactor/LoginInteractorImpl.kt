package com.example.ejerciciomvpkotlin.interactor

import android.os.Looper
import com.example.ejerciciomvpkotlin.interfaces.LoginInteractor
import com.example.ejerciciomvpkotlin.interfaces.LoginPresenter
import com.example.ejerciciomvpkotlin.presenter.LoginPresenterImpl
import java.util.logging.Handler

class LoginInteractorImpl:LoginInteractor {
    override fun validarUsuario(user: String, pass: String, presenter: LoginPresenterImpl) {


        run(){
            if (user == ""){
                presenter.setErrorUser()
            }
            else if(pass == ""){
                presenter.setErrorPassword()
            }
            else{
                if(user == ("rafael") || pass == "123"){
                    presenter.exito()
                }
                else{
                    presenter.noExiste()
                }
            }
        }
    }
}