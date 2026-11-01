package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class InputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        val etInput = findViewById<EditText>(R.id.etInput)
        val btnGonder = findViewById<Button>(R.id.btnGonder)

        btnGonder.setOnClickListener {
            val orijinalMetin = etInput.text.toString()

            // Sadece A-Z ve a-z arasını tut, gerisini sil (Regex)
            val temizMetin = orijinalMetin.replace(Regex("[^A-Za-z]"), "")


            val silinenSayisi = orijinalMetin.length - temizMetin.length


            val returnIntent = Intent()
            returnIntent.putExtra("TEMIZ_METIN", temizMetin)
            returnIntent.putExtra("SILINEN_SAYISI", silinenSayisi)
            setResult(RESULT_OK, returnIntent)

            finish()
        }
    }
}