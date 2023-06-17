package com.example.exemplocruddbo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criando o banco
        val dbo = DBConnect(this);
        val listausuario = dbo.ListarUsuarios()

        ListarUsuarios( listausuario)


    }

    //Ler a lista e exibir

    fun ListarUsuarios(listadeUsuarios: ArrayList<Usuario>) {
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listadeUsuarios)
        listView.adapter = adapter
    }


}