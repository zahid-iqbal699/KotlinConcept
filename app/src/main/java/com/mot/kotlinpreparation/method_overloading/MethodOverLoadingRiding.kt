package com.mot.kotlinpreparation.method_overloading

class MethodOverLoadingRiding {
    //Method Overloading Samples
    fun greet(name: String) {
        println("Hello, $name!")
    }

    fun greet(name: String, age: Int) {
        println("Hello, $name! You are $age years old.")
    }

    fun main() {
        greet("John") // prints "Hello, John!"
        greet("Jane", 30) // prints "Hello, Jane! You are 30 years old."
    }
    //Method Overriding Samples
    open class Animal {
        open fun sound() {
            println("The animal makes a sound.")
        }
    }

    class Dog : Animal() {
        override fun sound() {
            println("The dog barks.")
        }
    }
    fun mainOverriding() {
        val animal = Animal()
        animal.sound() // prints "The animal makes a sound."

        val dog = Dog()
        dog.sound() // prints "The dog barks."
    }


}