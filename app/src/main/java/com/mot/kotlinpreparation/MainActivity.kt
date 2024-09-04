package com.mot.kotlinpreparation

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mot.kotlinpreparation.abstraction.Car
import com.mot.kotlinpreparation.abstraction.Motorcycle
import com.mot.kotlinpreparation.sealed.Shape

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        try {
            //Test of Abstraction classes
            val car = Car()
            val motorcycle = Motorcycle()
            println("Car wheels: ${car.wheels}") // prints 4
            car.startEngine() // prints "Car engine started!"
            car.honk() // prints "Honk honk!"
            println("Motorcycle wheels: ${motorcycle.wheels}") // prints 2
            motorcycle.startEngine() // prints "Motorcycle engine started!"
            motorcycle.honk() // prints "Honk honk!"
            car.run()
            //End of test Abstraction classes
            //Call for sealed classes
            val circle = Shape.Circle(5.0)
            val rectangle = Shape.Rectangle(4.0, 6.0)

            //end of call for sealed class

    }catch (e:Exception){
            Log.e("TAG", "onCreate: Main Exception: $e" )
        }
    }

}