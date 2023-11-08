package com.example.projectbp2660

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnFairy: Button = findViewById(R.id.buttonMenu1)
        val btnReading: Button = findViewById(R.id.buttonMenu2)
        val btnSpace: Button = findViewById(R.id.buttonMenu3)

        btnFairy.setOnClickListener{
            val Intent1 = Intent(this,BookKidActivity::class.java)
            startActivity(Intent1)
        }
        btnReading.setOnClickListener{
            val Intent2 = Intent(this,ReadingActivity::class.java)
            startActivity(Intent2)
        }
        btnSpace.setOnClickListener {
            val Intent3 = Intent(this,ResponsiActivity::class.java)
            startActivity(Intent3)
        }

        val rvBuku:RecyclerView = findViewById(R.id.recyclerViewBuku)
        rvBuku.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1,"Emi's fhdhjafjhgrj", "dhgfhdsafhdbhfvsanbvvhvdhvhvffa"))
        data.add(BukuModel(R.drawable.book2,"Ryan's dhjgffdgffg","dgjgjsadgfkdshfhgsfgyuwetaeutyfry"))
        data.add(BukuModel(R.drawable.book4,"Dyah's djhsfsgfkjg","jdfgfgsghfdsfdhgfhjdgfggggghhdgfr"))

        val adapter = AdapterHome(data)
        rvBuku.adapter = adapter
    }
}