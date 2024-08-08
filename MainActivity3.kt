package com.dkl.ast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import io.realm.mongodb.App
import io.realm.mongodb.AppConfiguration
import io.realm.mongodb.mongo.MongoClient
import io.realm.mongodb.mongo.MongoCollection
import io.realm.mongodb.mongo.MongoDatabase
import org.bson.Document


class MainActivity3 : AppCompatActivity() {
    val appid:String = "aster-qytcc"
    val app = App(AppConfiguration.Builder(appid).build())
    val currentuser = app.currentUser()
    lateinit var editText: EditText
     lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        editText = findViewById(R.id.sad)
        button = findViewById(R.id.button2)
        val mangoClient: MongoClient? = currentuser?.getMongoClient("mongodb-atlas")
        val mongodatabase: MongoDatabase? = mangoClient?.getDatabase("AsterData")
        val mongoCollection:MongoCollection<Document> = mongodatabase?.getCollection("UserData") as MongoCollection<Document>
        button.setOnClickListener {
            mongoCollection.insertOne(Document("userid",currentuser?.id).append("data", editText.text.toString())).getAsync(App.Callback {
                 if (it.isSuccess){
                    Toast.makeText(this,"Uploaded",Toast.LENGTH_LONG).show()
                 } else {
                     Toast.makeText(this,"Failed",Toast.LENGTH_LONG).show()
                 }
             })


         }




    }
}