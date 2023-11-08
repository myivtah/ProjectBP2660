package com.example.projectbp2660

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResponsiActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_responsi)

        val location: TextView = findViewById(R.id.textViewRes)

        // Menambahkan tindakan klik ke TextView
        location.setOnClickListener {
            // Buat URI untuk menentukan lokasi (latitud dan longitud) pada Google Maps
            val gmmIntentUri = Uri.parse("geo:47.6,-122.3?z=11")

            // Buat intent untuk membuka aplikasi Google Maps
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")

            // Periksa apakah aplikasi Google Maps terpasang di perangkat
            if (mapIntent.resolveActivity(packageManager) != null) {
                // Buka aplikasi Google Maps dengan lokasi yang ditentukan
                startActivity(mapIntent)
            }
        }
    }
}