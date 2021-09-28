package com.example.anushmp.searchmovies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var searchlink : TextView
    lateinit var downloadlink: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        searchlink = findViewById(R.id.search)
        downloadlink = findViewById(R.id.download)


        searchlink.setOnClickListener {

            var i:Intent = Intent(this,SearchActivity::class.java)

            startActivity(i)

        }




    }
}