package com.vishnevskiypro.activitylifecycle23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vishnevskiypro.activitylifecycle23.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater).also { setContentView(it.root) }


        val extra = intent.extras?.get("myString") as Person

        binding.textRecieve.text = "The name is ${extra.name} the age is ${extra.age}"


    }
}