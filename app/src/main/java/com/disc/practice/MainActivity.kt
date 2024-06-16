package com.disc.practice

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var calsBurned = 0
    var calsConsumed = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun addBurned(v: View?) {
        val burnedEditText = findViewById<EditText>(R.id.burned)
        val newBurnedCals = burnedEditText.getText().toString().toInt()
        calsBurned = newBurnedCals
        updateChart()
    }

    fun addConsumed(v: View?) {
        val consumedEditText = findViewById<EditText>(R.id.consumed)
        val newConsumedCals = consumedEditText.getText().toString().toInt()
        calsConsumed = newConsumedCals
        updateChart()

    }

    fun updateChart() {
        val numberOfCals = findViewById<TextView>(R.id.number_of_calories)
        numberOfCals.text = "$calsBurned / $calsConsumed"

        val pieChart = findViewById<ProgressBar>(R.id.stats_progressbar)
        val d = calsBurned.toDouble() / calsConsumed.toDouble()
        val progress = (d * 100).toInt()
        pieChart.progress = progress
    }
}