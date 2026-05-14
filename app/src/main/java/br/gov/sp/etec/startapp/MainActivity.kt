package br.gov.sp.etec.startapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val intent = Intent(this, HomeActivity::class.java)
        val btnLogin = findViewById<Button>(R.id.buttonLogin)
        val editTextEmailLogin = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val editTextSenhaLogin = findViewById<EditText>(R.id.editTextNumberPassword)
        btnLogin.setOnClickListener {
            if (editTextEmailLogin.text.isEmpty() || editTextSenhaLogin.text.isEmpty()) {
                Toast.makeText(this, "Ops! Insira suas informações e tente novamente.", Toast.LENGTH_LONG).show()
            } else {
                if (editTextEmailLogin.text.toString().equals("teste@teste.com") &&
                    editTextSenhaLogin.text.toString().equals("123")) {
                    startActivity(intent)
                } else {
                    Toast.makeText( this, "Ops! Informações invalidas.", Toast.LENGTH_LONG).show()
                }
            }
        }
        val intent2 = Intent(this, ActivityCadastro::class.java)
        val btnCadastro = findViewById<Button>(R.id.buttonCadastrar)
        btnCadastro.setOnClickListener {
            startActivity(intent2)

        }

    }
}

