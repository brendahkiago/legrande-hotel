package com.example.legrandehotel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FacilityActivity : AppCompatActivity() {

    lateinit var facility: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facility)

        facility=findViewById(R.id.facility)

        facility.setOnClickListener {
            var myfacility= Intent(this, GalleryActivity::class.java)
            startActivity(myfacility)
        }
    }
}