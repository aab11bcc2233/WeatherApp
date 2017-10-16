package com.example.tianching.weatherapp

import android.util.Log
import java.net.URL

/**
 * Created by dalu-tp on 2017/10/16.
 */

class Request(val url: String) {

    fun run() {
        val forecastJsonStr = URL(url).readText()

        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}