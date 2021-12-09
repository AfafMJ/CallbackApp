package com.afaf.callbackapp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Log.i("MainActivity", "On Create")

        Toast.makeText(this,"On Create Activity3" , Toast.LENGTH_SHORT).show()


    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "On Start")
        Toast.makeText(this,"On Start Activity3" , Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "On Pause")
        Toast.makeText(this,"On pause Activity3" , Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "On Resume")
        Toast.makeText(this,"On Resume Activity3" , Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "On Stop")
        Toast.makeText(this,"On Stop Activity3" , Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "On Destroy")
        Toast.makeText(this,"On Destroy Activity3" , Toast.LENGTH_SHORT).show()
    }

}