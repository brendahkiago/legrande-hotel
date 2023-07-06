package com.example.legrandehotel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class HomeActivity : AppCompatActivity() {

    lateinit var mybutton: Button
    lateinit var butt:Button
    lateinit var but3:Button
    lateinit var but4:Button

    lateinit var home: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        mybutton = findViewById(R.id.button1)
        butt= findViewById(R.id.button2)
        but3=findViewById(R.id.button3)
        but4=findViewById(R.id.button4)




        mybutton.setOnClickListener {
            var butt1 = Intent(this, EmailActivity::class.java)
            startActivity(butt1)
        }

        butt.setOnClickListener {
            var butt2 = Intent(this, EmailActivity::class.java)
            startActivity(butt2)
        }


        but3.setOnClickListener {
            var but3 = Intent(this, EmailActivity::class.java)
            startActivity(but3)
        }

        but3.setOnClickListener {
            var but4 = Intent(this, EmailActivity::class.java)
            startActivity(but4)
        }

        home=findViewById(R.id.home)
        

        home.setOnClickListener {
            var myhome= Intent(this, GalleryActivity::class.java)
            startActivity(myhome)
        }

        }
    }

