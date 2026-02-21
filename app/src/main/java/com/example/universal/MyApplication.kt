package com.example.universal

import android.app.Application
// import com.google.firebase.FirebaseApp

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Firebase initialization disabled for debug builds
        // FirebaseApp.initializeApp(this)
    }
}
