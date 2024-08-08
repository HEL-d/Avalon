package com.dkl.ast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class Helpactivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_helpactivity)
        imageView = findViewById(R.id.oop2)
        Glide.with(this).load(R.drawable.cal).into(imageView)
    }
}