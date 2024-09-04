package com.mot.kotlinpreparation.singleton_classes

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

object DatabaseHelper {
    private lateinit var database: SQLiteDatabase

    fun init(context: Context) {
        val dbHelper = object : SQLiteOpenHelper(context, "my_database", null, 1) {
            override fun onCreate(db: SQLiteDatabase) {
                db.execSQL("CREATE TABLE users (_id INTEGER PRIMARY KEY, name TEXT, email TEXT)")
            }
            override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
                // handle database upgrade
            }
        }
        database = dbHelper.writableDatabase
    }

    fun insertUser(name: String, email: String) {
        database.execSQL("INSERT INTO users (name, email) VALUES ('$name', '$email')")
    }

    fun readUsers(): Cursor {
        return database.rawQuery("SELECT * FROM users", null)
    }
}

//Usage of this one
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DatabaseHelper.init(this)
        DatabaseHelper.insertUser("John Doe", "john.doe@example.com")
        val cursor = DatabaseHelper.readUsers()
        // do something with the cursor
    }
}

