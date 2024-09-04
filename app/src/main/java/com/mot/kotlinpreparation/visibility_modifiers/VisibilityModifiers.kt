package com.mot.kotlinpreparation.visibility_modifiers


//Public Access specifier
public class PublicClass {
    public fun publicFunction() {
        println("Public function")
    }
}
//Private Access specifier
private class PrivateClass {
    private fun privateFunction() {
        println("Private function")
    }
    fun sameFileAccess() {
        val privateObject = PrivateClass()
        privateObject.privateFunction() // prints "Private function"
    }

}
//Protected Access specifier
//protected class ProtectedClass {
//    protected fun protectedFunction() {
//        println("Protected function")
//    }
//}
//
//class Subclass : ProtectedClass() {
//    fun subclassAccess() {
//        protectedFunction() // prints "Protected function"
//    }
//}
//fun mainP() {
//    // val protectedObject = ProtectedClass() // Error: Cannot access protected class
//    val subclassObject = Subclass()
//    subclassObject.subclassAccess() // prints "Protected function"
//}
//End of Protected Access specifier
//Internal Access specifier
// File1.kt
internal class InternalClass {
    internal fun internalFunction() {
        println("Internal function")
    }
}
//End of Internal Access specifier

fun main() {
    //For Public Class
    val publicObject = PublicClass()
    publicObject.publicFunction() // prints "Public function"
    //private Access Specifier
    val privateObject = PrivateClass()
    // privateObject.privateFunction()//Cannot access 'privateFunction': it is private in 'PrivateClass'


    //Internal Access Specifier
    val internalObject = InternalClass()
    internalObject.internalFunction() // prints "Internal function"

}
