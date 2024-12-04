package com.nazarkopelchak.locationtracking

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import com.nazarkopelchak.locationtracking.utils.Constants

class LocationApp: Application() {

    override fun onCreate() {
        super.onCreate()
        val notificationChannel = NotificationChannel(
            Constants.CHANNEL_ID,
            "Location",
            NotificationManager.IMPORTANCE_LOW
        )
        val notificationManager = applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(notificationChannel)
    }
}