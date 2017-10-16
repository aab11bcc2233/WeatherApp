package com.example.tianching.weatherapp.domain

import com.example.tianching.weatherapp.ForecastRequest

/**
 * Created by dalu-tp on 2017/10/16.
 */
class RequestForecastCommand(val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}