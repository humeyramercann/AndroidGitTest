package com.humeyramercan.androidgittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("hello")
        println("second line")
        println("third line")
        println("fourth line")
        println("fifth line")
    }
}