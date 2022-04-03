package com.example.ejerciciomvpkotlin.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import com.example.ejerciciomvpkotlin.R
import com.example.ejerciciomvpkotlin.interfaces.LoginPresenter
import com.example.ejerciciomvpkotlin.interfaces.LoginView
import com.example.ejerciciomvpkotlin.presenter.LoginPresenterImpl

class Login : AppCompatActivity(), LoginView {

    lateinit var txtUsuario:EditText
    lateinit var txtPass:EditText
    lateinit var btnLogin:Button
    lateinit var barraProgreso:ProgressBar

    lateinit var presenter:LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtUsuario = findViewById(R.id.txtUser)
        txtPass = findViewById(R.id.txtPass)
        btnLogin = findViewById(R.id.btnLogin)
        barraProgreso = findViewById(R.id.barraProgreso)

        presenter = LoginPresenterImpl(this);
    }

    override fun exito() {
        val intent = Intent(this, OtraActividad::class.java)
        startActivity(intent)
    }

    override fun noExite() {
        Toast.makeText(this, "El usuario no existe", Toast.LENGTH_SHORT).show()
    }

    override fun setErrorUser() {
        txtUsuario.error = "Campo usuario obligatorio";
    }

    override fun setErrorPassword() {
        txtPass.error = "Campo password obligatorio"
    }

    override fun mostrarProgreso() {
        barraProgreso.visibility = View.VISIBLE;
    }

    override fun esconderProgreso() {
        barraProgreso.visibility = View.GONE
    }

    fun solicitarValidacion(view: View){
        presenter.validarUsuario(txtUsuario.text.toString(), txtPass.text.toString())
    }
}