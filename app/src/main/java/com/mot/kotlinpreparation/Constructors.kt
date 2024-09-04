package com.mot.kotlinpreparation

class Constructors {
    //Primary Constructor
    class Person(name: String, age: Int) {
        val name: String = name
        val age: Int = age
    }
    //Secondary Constructor
    /*Secondary constructors are additional constructors that can be used to initialize a class. They are declared inside the class body and must call the primary constructor*/
    class PersonSecond constructor(name: String, age: Int) {
        val name: String
        val age: Int

        init {
            this.name = name
            this.age = age
        }

        constructor(name: String) : this(name, 0) {
            // secondary constructor that calls primary constructor
        }
    }
    //Default Constructor
    /*
    A default constructor is a constructor that takes no arguments. If no primary constructor is declared, a default constructor is generated automatically.
    */
    class PersonDefault constructor() {
        // default constructor is generated automatically
    }

}