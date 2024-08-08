package com.dkl.ast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.realm.mongodb.App
import io.realm.mongodb.AppConfiguration

class Splashscreen : AppCompatActivity() {
    val appid:String = "aster-qytcc"
    val app = App(AppConfiguration.Builder(appid).build())
    val currentuser = app.currentUser()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
            if (currentuser != null){
                startActivity(Intent(this,MainActivity3::class.java))
            } else {
                startActivity(Intent(this,EntranceActivity::class.java))
            }

    }
}