package com.mot.kotlinpreparation.data_classes

data class Weather(val temperature: Double, val humidity: Int, val windSpeed: Double)
//Main Calling of the code
fun main() {
    val weather = Weather(25.0, 60, 10.5)
    println(weather.humidity) // prints Weather(temperature=25.0, humidity=60, windSpeed=10.5)
    println(weather.temperature) // prints Weather(temperature=25.0, humidity=60, windSpeed=10.5)
    println(weather.windSpeed) // prints Weather(temperature=25.0, humidity=60, windSpeed=10.5)
}
