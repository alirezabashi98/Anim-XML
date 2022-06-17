package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animation.databinding.ActivityLottieBinding
import ir.dunijet.animation.ext.BaseActivity

class LottieActivity : BaseActivity() {
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