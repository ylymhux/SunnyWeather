package com.sunnyweather.android

import android.app.Application
import android.content.Context

class SunnyWeatherApplication:Application() {

    companion object{
        const val TOKEN="5Bxq7aes14pfhjkS"
        @SuppressWarnings("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}