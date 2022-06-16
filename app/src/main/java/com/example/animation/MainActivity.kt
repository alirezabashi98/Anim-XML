package com.example.animation

import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import androidx.appcompat.app.AppCompatActivity
import com.example.animation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setAnim()
    }

    private fun setAnim() {
        binding.btnAnim.setOnClickListener {
            startAlphaAnim()
        }
    }

    private fun startAlphaAnim() {
        val anim = AlphaAnimation(1f, 0f)
        anim.duration = 1000
        anim.fillAfter = true
        anim.repeatCount = 5
        anim.repeatMode = Animation.REVERSE

        anim.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(p0: Animation?) {
                TODO("Not yet implemented")
            }

            override fun onAnimationEnd(p0: Animation?) {
                TODO("Not yet implemented")
            }

            override fun onAnimationRepeat(p0: Animation?) {
                TODO("Not yet implemented")
            }
        })

        binding.txtAnim.startAnimation(anim)
    }
}