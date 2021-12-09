package com.afaf.callbackapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "On Create")

        Toast.makeText(this,"On Create MainActivity" ,Toast.LENGTH_SHORT).show()
        val btGo = findViewById<Button>(R.id.goToActivity2)
        btGo.setOnClickListener(object :  View.OnClickListener {
            override fun onClick(v: View?) {

                val intent = Intent(this@MainActivity,Activity2::class.java)
                startActivity(intent)

            }

        })

    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "On Start")
        Toast.makeText(this,"On Start MainActivity" ,Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "On Pause")
        Toast.makeText(this,"On pause MainActivity" ,Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "On Resume")
        Toast.makeText(this,"On Resume MainActivity" ,Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "On Stop")
        Toast.makeText(this,"On Stop MainActivity" ,Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "On Destroy")
        Toast.makeText(this,"On Destroy MainActivity" ,Toast.LENGTH_SHORT).show()
    }

}