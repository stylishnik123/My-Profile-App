package com.example.nikhilprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var photo: ImageView?=null
    var eduButton: Button?=null
    var workButton: Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        photo = findViewById(R.id.pPhoto)
        photo?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity,profilephoto::class.java)
            startActivity (clickIntent)
        })
        eduButton = findViewById(R.id.educationButton)
        eduButton?.setOnClickListener({
            var clickIntent1 = Intent(this@MainActivity,aboutme::class.java)
            startActivity (clickIntent1)
        })
        workButton = findViewById(R.id.workingButton)
        workButton?.setOnClickListener({
            var clickIntent2 = Intent(this@MainActivity, workexperience::class.java)
            startActivity (clickIntent2)


        })


    }
}
