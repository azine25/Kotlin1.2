package com.geek.kotlin12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.geek.kotlin12.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val arrayList = arrayListOf(
        "https://i.pinimg.com/564x/2f/06/ff/2f06ff01c99d9fb0fab59b352c689a1f.jpg",
        "https://i.pinimg.com/236x/5d/4a/fc/5d4afc4edf15f6e8b617960e149e9166.jpg",
        "https://i.pinimg.com/236x/53/5b/1d/535b1d90ed24cd2ab33a5b46692e338e.jpg",
        "https://i.pinimg.com/236x/95/40/bf/9540bf56145c77b9f75269d578778d6d.jpg",
        "https://i.pinimg.com/236x/9b/9c/47/9b9c4760e7de03ef682ffe0fd099c5e9.jpg",
        "https://i.pinimg.com/236x/ee/3f/e1/ee3fe16060aedab7a6b41440115fa333.jpg",
        "https://i.pinimg.com/564x/d6/03/7c/d6037c155c63c7ecc8ad62b34ec009ef.jpg",
        "https://i.pinimg.com/236x/e1/e7/1e/e1e71efc5846eb69d7296847bac20bba.jpg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onResume() {
        super.onResume()
        binding.btn2.setOnClickListener {
            Glide.with(binding.root)
                .load(arrayList.random())
                .into(binding.iv)
        }

        if (binding.et.text.isNullOrEmpty()) {
            Toast.makeText(this, "LOAD URL", Toast.LENGTH_SHORT).show()
        } else {
            binding.btn1.setOnClickListener {
                arrayList.add(binding.et.text.toString())
            }
        }
    }
}