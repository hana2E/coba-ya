package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        textView.text = viewModel.angka.toString()

        button.setOnClickListener{
            viewModel.tambahAngka()
            textView.text = viewModel.angka.toString()

        }
    }
}