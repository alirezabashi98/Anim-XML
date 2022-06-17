package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animation.databinding.ActivityLottieBinding

class LottieActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLottieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLottieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStartLottie.setOnClickListener {
            binding.lottieMain.playAnimation()
        }

    }
}