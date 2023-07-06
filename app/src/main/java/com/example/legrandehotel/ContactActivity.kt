package com.example.legrandehotel

import android.content.Intent
import android.graphics.drawable.Icon
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toolbar

class ContactActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var cont:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        button = findViewById(R.id.button)
        cont=findViewById(R.id.contact)

        button.setOnClickListener {
            Toast.makeText(applicationContext,"Message sent successfully",Toast.LENGTH_LONG).show()
        }

        cont.setOnClickListener {
            var mycontact=Intent(this, GalleryActivity::class.java)
            startActivity(mycontact)
        }
    }
}
