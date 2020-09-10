package com.example.bmi2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b_help.setOnClickListener{
            AlertDialog.Builder(this)
                .setTitle("BMI計算公式")
                .setMessage("體重(kg) / 身高(m)*身高(m)")
                .setPositiveButton("確認",null)
                .show()
        }
    }

    fun bmi (view: View){
        val weight = ed_weight.text.toString().toFloat()
        val height = ed_height.text.toString().toFloat()
        val bmi = weight / (height*height)
        Log.d("BMI",bmi.toString())
        Toast.makeText(this,bmi.toString(),Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this)
            .setTitle("Your BMI")
            .setMessage(bmi.toString())
            .setPositiveButton("OK",null)
            .setNegativeButton("CANCEL",null)
            .show()
    }

}