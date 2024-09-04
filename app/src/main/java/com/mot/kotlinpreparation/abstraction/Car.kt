package com.mot.kotlinpreparation.abstraction

class Car : Vehicle() {
    // Implementing abstract property
    override val wheels: Int = 4

    // Implementing abstract method
    override fun startEngine() {
        println("Car engine started!")
    }

}