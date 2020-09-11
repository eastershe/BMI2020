package com.example.bmi2020

import android.content.Intent
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
        Log.d("BMI2020Test","onCreate")
    }


    fun bmi (view: View){
        val weight = ed_weight.text.toString().toFloat()
        val height = ed_height.text.toString().toFloat()
        val bmi = weight / (height*height)
        Log.d("BMI",bmi.toString())
        Intent(this,ResultActivity::class.java).apply {
            val bag = Bundle()
            bag.putFloat(getString(R.string.user_height),height)
            bag.putFloat(getString(R.string.user_weight),weight)
            bag.putFloat(getString(R.string.user_bmi),bmi)
            putExtras(bag)
            startActivity(this)
        }
//        //傳統intent寫法
//        val intent = Intent(this,ResultActivity::class.java)
//        startActivity(intent)
//        //AlertDiaLog Toast 寫法
//        Toast.makeText(this,bmi.toString(),Toast.LENGTH_LONG).show()
//        AlertDialog.Builder(this)
//            .setTitle("Your BMI")
//            .setMessage(bmi.toString())
//            .setPositiveButton("OK",null)
//            .setNegativeButton("CANCEL",null)
//            .show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("BMI2020Test","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BMI2020Test","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("BMI2020Test","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BMI2020Test","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("BMI2020Test","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BMI2020Test","onDestroy")
    }
}

