package com.example.bmi2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
//        val bmi = intent.getFloatExtra("BMI_EXTRA", 0f)
        val bag = intent.extras
        result.setText(bag?.getFloat(getString(R.string.user_bmi),0f).toString())
        weight_view.setText(bag?.getFloat(getString(R.string.user_weight),0f).toString())
        height_view.setText(bag?.getFloat(getString(R.string.user_height),0f).toString())

    }
}