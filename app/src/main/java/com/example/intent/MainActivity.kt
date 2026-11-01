package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGit = findViewById<Button>(R.id.btnGit)

        btnGit.setOnClickListener {
            val intent = Intent(this, InputActivity::class.java)

            startActivityForResult(intent, 123)
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 123 && resultCode == RESULT_OK) {
            val temizMetin = data?.getStringExtra("TEMIZ_METIN")
            val silinenSayisi = data?.getIntExtra("SILINEN_SAYISI", 0)


            Toast.makeText(this, "Temiz: $temizMetin \nSilinen: $silinenSayisi", Toast.LENGTH_LONG).show()
        }
    }
}