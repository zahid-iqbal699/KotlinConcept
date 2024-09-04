package com.mot.kotlinpreparation.abstraction

class Motorcycle : Vehicle() {
    // Implementing abstract property
    override val wheels: Int = 2

    // Implementing abstract method
    override fun startEngine() {
        println("Motorcycle engine started!")
    }

}