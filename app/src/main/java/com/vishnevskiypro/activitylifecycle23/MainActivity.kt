package com.vishnevskiypro.activitylifecycle23

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import com.vishnevskiypro.activitylifecycle23.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
        Log.d("AAAAA", "onCreate")


        val ivan = Person()
        ivan.name = "Ivan"
        ivan.age = 36


        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("myString", ivan)

        binding.buttonSet.setOnClickListener {
            binding.tvData.text = "This is my meesage"
        }

        binding.buttonSet2.setOnClickListener {
            startActivity(intent)
        }

    }

    override fun onStart() {
        Log.d("AAAAA", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("AAAAA", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("AAAAA", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("AAAAA", "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("AAAAA", "onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d("AAAAA", "onRestart")
        super.onRestart()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        val dataString = binding.tvData.text.toString()
        outState.putString("myData", dataString)

        super.onSaveInstanceState(outState)
        Log.d("AAAAA", "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        val dataString = savedInstanceState.getString("myData")
        binding.tvData.text = dataString

        super.onRestoreInstanceState(savedInstanceState)
        Log.d("AAAAA", "onRestoreInstanceState")
    }


}