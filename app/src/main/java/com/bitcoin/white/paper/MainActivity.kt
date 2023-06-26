package com.bitcoin.white.paper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    private lateinit var textLinearLayout: LinearLayout
    private lateinit var previousButton: Button
    private lateinit var nextButton: Button

    private var page = 0
    private lateinit var view: View

    private val TAG = "MainActivity1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()
        updateLinearLayoutContent()
        Log.d(TAG, "onCreate")
        previousButton.setOnClickListener() {
            if(page > 0) {
                page--
                updateLinearLayoutContent()
            }
            Log.d(TAG, "previousButton")
        }
        nextButton.setOnClickListener() {
            if(page < 13) {
                page++
                updateLinearLayoutContent()
            }
            Log.d(TAG, "nextButton")
        }

    }

    private fun initialize() {
        textLinearLayout = findViewById(R.id.textLinearLayout)
        previousButton = findViewById(R.id.previousButton)
        nextButton = findViewById(R.id.nextButton)
        Log.d(TAG, "initialize")
    }

    private fun updateLinearLayoutContent() {
        Log.d(TAG, "updateLinearLayoutContent 1")
        textLinearLayout.removeAllViews()
        when (page) {
            0 -> LayoutInflater.from(this).inflate(R.layout.text_0, textLinearLayout, true)
            1 -> LayoutInflater.from(this).inflate(R.layout.text_1, textLinearLayout, true)
            2 -> LayoutInflater.from(this).inflate(R.layout.text_2, textLinearLayout, true)
            3 -> LayoutInflater.from(this).inflate(R.layout.text_3, textLinearLayout, true)
            4 -> LayoutInflater.from(this).inflate(R.layout.text_4, textLinearLayout, true)
            5 -> LayoutInflater.from(this).inflate(R.layout.text_5, textLinearLayout, true)
            6 -> LayoutInflater.from(this).inflate(R.layout.text_6, textLinearLayout, true)
            7 -> LayoutInflater.from(this).inflate(R.layout.text_7, textLinearLayout, true)
            8 -> LayoutInflater.from(this).inflate(R.layout.text_8, textLinearLayout, true)
            9 -> LayoutInflater.from(this).inflate(R.layout.text_9, textLinearLayout, true)
            10 -> LayoutInflater.from(this).inflate(R.layout.text_10, textLinearLayout, true)
            11 -> LayoutInflater.from(this).inflate(R.layout.text_11, textLinearLayout, true)
            12 -> LayoutInflater.from(this).inflate(R.layout.text_12, textLinearLayout, true)
            13 -> LayoutInflater.from(this).inflate(R.layout.text_13, textLinearLayout, true)

        }
        Log.d(TAG, "updateLinearLayoutContent 2")
    }
}