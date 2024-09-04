package com.mot.kotlinpreparation.abstraction

abstract class Vehicle {
    // Abstract property
    abstract val wheels: Int

    // Abstract method
    abstract fun startEngine()

    // Concrete property
    val color: String = "Red"

    // Concrete method
    fun honk() {
        println("Honk honk!")
    }  // Concrete method
    fun run() {
        println("Vehicle is Running!")
    }
}
