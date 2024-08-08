package com.dkl.ast

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.bumptech.glide.Glide
import io.realm.mongodb.App
import io.realm.mongodb.AppConfiguration
import io.realm.mongodb.Credentials

class EntranceActivity : AppCompatActivity() {
    val appid:String = "aster-qytcc"
    lateinit var cardView: CardView
     lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entrance)
        cardView = findViewById(R.id.ccv)
        imageView = findViewById(R.id.vvvv)
        Glide.with(this).load(R.drawable.saly).into(imageView)
        val app = App(AppConfiguration.Builder(appid).build())
        cardView.setOnClickListener {
            app.loginAsync(Credentials.anonymous(),App.Callback {
                if (it.isSuccess){
                    startActivity(Intent(this,MainActivity3::class.java))
                } else {
                    Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()
                }
            })


        }

    }
}