package com.example.tianching.weatherapp.domain

/**
 * Created by dalu-tp on 2017/10/16.
 */

data class ForecastList(val city: String, val country: String,
                        val dailyForecast:List<Forecast>)

data class Forecast(val date: String, val description: String, val high: Int,
                    val low: Int)