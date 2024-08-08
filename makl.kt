package com.dkl.ast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

import com.bumptech.glide.Glide

class makl : AppCompatActivity() {
    lateinit var imageView1: ImageView
    lateinit var imageView2: ImageView
    lateinit var imageView3: ImageView
    lateinit var imageView4: ImageView
    lateinit var imageView5: ImageView
    lateinit var imageView6: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makl)
        imageView1 = findViewById(R.id.oop1)
        imageView2 = findViewById(R.id.oop2)
        imageView3 = findViewById(R.id.zxc)
        imageView4 = findViewById(R.id.mno)
        imageView5 = findViewById(R.id.aaa)
        imageView6 = findViewById(R.id.lpo)

        Glide.with(this).load(R.drawable.ksi).into(imageView1)
            Glide.with(this).load(R.drawable.book).into(imageView2)
            Glide.with(this).load(R.drawable.vide).into(imageView3)
            Glide.with(this).load(R.drawable.friends).into(imageView4)
            Glide.with(this).load(R.drawable.lopi).into(imageView5)
            Glide.with(this).load(R.drawable.help).into(imageView6)















    }
}