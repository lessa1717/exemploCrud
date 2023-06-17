package com.example.exemplocrud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //Nossa Lista

    private lateinit var listView: ListView
    private lateinit var campoNome: EditText
    private lateinit var campoEmail: EditText

    //Posição lista
    private var positionList = -1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Identificar a lista
        listView = findViewById(R.id.listaUsuarios)

        val dbo = DBConnect(this)
        val listadeUsuarios = dbo.ListarUsuarios()


        // Receber os 3 botões

//        var btn_cadastrar = findViewById<Button>(R.id.btn_cadastrar)
//        var btn_alterar = findViewById<Button>(R.id.btn_alterar)
//        var btn_remover = findViewById<Button>(R.id.btn_remover)


        //Receber os 2 campos
//        campoNome = findViewById<EditText>(R.id.nome)
//        campoEmail = findViewById<EditText>(R.id.email)

        //Instanciar uma lista de usuarios

//        var listadeUsuarios = ArrayList<Usuario>();
//        listadeUsuarios.add( Usuario("Exemplo", "exemplo@email.com"))
        ListarUsuarios(listadeUsuarios)

        //Pega o item clicado na lista


//        listView.setOnItemClickListener { _, _, position, _ ->
//            //Toast.makeText(this,"$position", Toast.LENGTH_SHORT).show()
//            positionList = position
//
//            campoNome.setText(listadeUsuarios[position].nome)
//            campoEmail.setText(listadeUsuarios[position].email)
//        }


//        btn_cadastrar.setOnClickListener()
//        {
//            var novoUsuario = Usuario(campoNome.text.toString(), campoEmail.text.toString())
//
//            listadeUsuarios.add(novoUsuario)
//
//            //Limpar os campos
//            LimparCampos()
//        }
//
//        btn_alterar.setOnClickListener()
//        {
//            if (positionList >= 0) {
//
//            }
//            listadeUsuarios[positionList].nome = campoNome.text.toString()
//            listadeUsuarios[positionList].email = campoEmail.text.toString()
//            //Recarregar a lista de usuários
//            ListarUsuarios(listadeUsuarios)
//
//            //Limpar os campos
//            LimparCampos()
//        }
//        btn_remover.setOnClickListener()
//        {
//            if (positionList >= 0) {
//                listadeUsuarios.removeAt(positionList)
//
//                ListarUsuarios(listadeUsuarios)
//
//
//                LimparCampos()
//            }
//        }

    }


    //Ler a lista e exibir

    fun ListarUsuarios(listadeUsuarios: ArrayList<Usuario>) {
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listadeUsuarios)
        listView.adapter = adapter
    }

//    fun LimparCampos() {
//        positionList = -1;
//        campoNome.setText("")
//        campoEmail.setText("")
//    }
}

