package com.palash.in_app_messaging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.FirebaseApp
import com.google.firebase.inappmessaging.FirebaseInAppMessaging

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initialize Firebase
        FirebaseApp.initializeApp(this)

        // Initialize Firebase In-App Messaging
        FirebaseInAppMessaging.getInstance().isAutomaticDataCollectionEnabled = true
    }
}