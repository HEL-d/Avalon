package com.dkl.ast
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class Aboutaster : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var imageView1: ImageView
    lateinit var imageView2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutaster)
        imageView = findViewById(R.id.oop1)
        imageView1 = findViewById(R.id.oop2)
        imageView2 = findViewById(R.id.oop3)
        Glide.with(this).load(R.drawable.gterm).into(imageView)
        Glide.with(this).load(R.drawable.boy).into(imageView1)
        Glide.with(this).load(R.drawable.que).into(imageView2)
    }




}