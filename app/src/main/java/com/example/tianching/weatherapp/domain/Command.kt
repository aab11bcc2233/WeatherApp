package com.example.tianching.weatherapp.domain

/**
 * Created by dalu-tp on 2017/10/16.
 */
interface Command<T> {
    fun execute(): T
}