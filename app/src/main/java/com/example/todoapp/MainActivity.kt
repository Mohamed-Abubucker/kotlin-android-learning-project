package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.todoapp.R.id.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var incButton:Button
    private lateinit var decButton:Button
    private lateinit var valueText:TextView
    private lateinit var navButton:Button
    private var valueInt: Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        incButton= findViewById<Button>(inc)
        decButton= findViewById<Button>(dec)
        navButton= findViewById<Button>(nav)

        valueText= findViewById<TextView>(value)

        incButton.setOnClickListener{
            valueInt++
            valueText.text=valueInt.toString()
        }

        decButton.setOnClickListener{
            valueInt--
            valueText.text=valueInt.toString()
        }

        navButton.setOnClickListener{
            val intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}
