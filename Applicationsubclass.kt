package com.dkl.ast

import android.app.Application
import io.realm.Realm

class Applicationsubclass:Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }


}