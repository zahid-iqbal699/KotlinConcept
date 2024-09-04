package com.mot.kotlinpreparation.interfaces

import java.io.Serializable

class Document : Printable, Serializable, AdvancedPrintable {

    override fun print() {
        println("Printing document")
    }

    override fun print2() {
        println("Printing document 2")
    }

    override fun printInColor() {
        println("Printing document in color...")
    }


}