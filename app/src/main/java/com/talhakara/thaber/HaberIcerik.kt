package com.talhakara.thaber

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HaberIcerik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_haber_icerik)

        // Intent'ten haber başlığı ve içeriği verilerini al
        val haberBaslik = intent.getStringExtra("haberBaslik")
        val haberIcerik = intent.getStringExtra("haberIcerik")

        // TextView öğelerini bul
        val titleTextView: TextView = findViewById(R.id.titleTextView)
        val rowDescriptionTextView: TextView = findViewById(R.id.row_descriptionTextView)

        // Başlık ve içeriği ilgili TextView'lere ata
        titleTextView.text = haberBaslik
        rowDescriptionTextView.text = haberIcerik
    }
}

