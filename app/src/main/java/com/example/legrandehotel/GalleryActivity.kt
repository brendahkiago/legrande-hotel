package com.example.legrandehotel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class GalleryActivity : AppCompatActivity() {

    lateinit var map: TextView
    lateinit var facility: TextView
    lateinit var contact: TextView
    lateinit var home: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        map = findViewById(R.id.map)
        facility = findViewById(R.id.facilities)
        contact = findViewById(R.id.contact)
        home = findViewById(R.id.home)


        map.setOnClickListener {
            val intent = Intent(this, LocationActivity::class.java)
            startActivity(intent)

        }

        facility.setOnClickListener {
            val intent = Intent(this, FacilityActivity::class.java)
            startActivity(intent)

        }

        contact.setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }


        home.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}