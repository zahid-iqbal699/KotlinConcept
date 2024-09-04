package com.mot.kotlinpreparation.type_casting

class TypeCasting {
    //Safe Casts example
    fun safeCasts() {
        val obj: Any = "Hello"
        val str: String? = obj as? String
        println(str) // prints "Hello"
    }
    //Unsafe Casts example
    fun unsafeCasts() {
        val obj: Any = "Hello"
        val str: String = obj as String
        println(str) // prints "Hello"
    }
    //Type Checking Example
    fun typeCheckingExample() {
        val obj: Any = "Hello"
        if (obj is String) {
            println(obj.length) // prints 5
        }
    }

}