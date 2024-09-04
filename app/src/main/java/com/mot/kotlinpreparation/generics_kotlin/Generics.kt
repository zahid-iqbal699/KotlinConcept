package com.mot.kotlinpreparation.generics_kotlin

//Generics Class
class Box<T>(t: T) {
    var value = t
    fun getValue(): T {
        return value
    }

    fun setValue(newValue: T) {
        value = newValue
    }

    fun <U> transform(transformer: (T) -> U): Box<U> {
        return Box(transformer(value))
    }

    fun <U> map(mapper: (T) -> U): Box<U> {
        return Box(mapper(value))
    }

}

fun main() {
    val stringBox = Box("Hello")
    println(stringBox.getValue()) // prints "Hello"

    val intBox = stringBox.transform { it.length }
    println(intBox.getValue()) // prints 5

    val upperCaseBox = stringBox.map { it.uppercase() }
    println(upperCaseBox.getValue()) // prints "HELLO"
}

//End of Generics Class
//Generics Interface
interface Printable<T> {
    fun printElement(element: T)
}

// usage
class StringPrinter : Printable<String> {
    override fun printElement(element: String) {
        println(element)
    }
}

class IntegerPrinter : Printable<Int> {
    override fun printElement(element: Int) {
        println(element)
    }
}

fun mainForInterface() {
    val printer = StringPrinter()
    printer.printElement("Hello")
    val printer2 = IntegerPrinter()
    printer2.printElement(1)
}
//End of generics interface


