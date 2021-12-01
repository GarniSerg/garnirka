package com.garnirka.myfirstapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var helloTextView: TextView
    lateinit var pushTheButtonButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloTextView = findViewById(R.id.hello_world_text_view)
        pushTheButtonButton = findViewById(R.id.push_the_button_button)

        pushTheButtonButtonClick()
    }

    fun pushTheButtonButtonClick() {
        pushTheButtonButton.setOnClickListener {
            helloTextView.text = mutableListOf('a', 'c', 'e', 'g', 'i', 'k', 'm', 'o', 'q', 's', 'u', 'w', 'y').toString()


                }

            }
        }



