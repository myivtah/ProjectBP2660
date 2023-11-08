package com.example.projectbp2660

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class ReadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reading)


        val btnNovels: Button = findViewById(R.id.buttonNovel)
        val btnComics: Button = findViewById(R.id.buttonComics)
        val btnToon: Button = findViewById(R.id.buttonToon)

        //evemt button fairy
        btnNovels.setOnClickListener{
            replaceFragment(NovelsFragment())
        }
        //event button fable
        btnComics.setOnClickListener {
            replaceFragment(ComicsFragment())
        }
        //event button science
        btnToon.setOnClickListener {
            replaceFragment(ToonFragment())
        }
        replaceFragment(NovelsFragment())
    }
    //create method replace fragment
    private fun replaceFragment(frg: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentReading,frg)
        fragmentTrx.commit()
    }
}