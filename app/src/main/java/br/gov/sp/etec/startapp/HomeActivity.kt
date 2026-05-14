package br.gov.sp.etec.startapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val intent3 = Intent(this, vagasLivresActivity::class.java)
        val vagaslivresbtn = findViewById<Button>(R.id.vagaslivresbutton)
        vagaslivresbtn.setOnClickListener {
            startActivity(intent3)

            val intent4 = Intent(this, vagasocupadasActivity::class.java)
            val vagasOcupadasbtn = findViewById<Button>(R.id.vagasocupadasbutton)
            vagasOcupadasbtn.setOnClickListener {
                startActivity(intent4)

            }
        }
    }
}