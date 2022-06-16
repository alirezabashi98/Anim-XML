package com.example.animation

import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import android.widget.Toast
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
            startScaleAnimation()
        }
    }

    private fun startAlphaAnim() {
        val anim = AlphaAnimation(1f, 0f)
        anim.duration = 5000
        anim.fillAfter = true
        anim.repeatCount = 1
        anim.repeatMode = Animation.REVERSE

        anim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(p0: Animation?) {
                Toast.makeText(this@MainActivity, "anim started", Toast.LENGTH_SHORT).show()
            }

            override fun onAnimationEnd(p0: Animation?) {
                Toast.makeText(this@MainActivity, "anim ended", Toast.LENGTH_SHORT).show()
            }

            override fun onAnimationRepeat(p0: Animation?) {
                Toast.makeText(this@MainActivity, "anim repeated", Toast.LENGTH_SHORT).show()
            }
        })

        binding.txtAnim.startAnimation(anim)
    }

    private fun startScaleAnimation() {
        val anim = ScaleAnimation(1f, 2f, 1f, 2f)
        anim.duration = 1000
        anim.fillAfter = true

        val anim2 = ScaleAnimation(
            1f, 2f, 1f, 2f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 05f
        )
        anim2.duration = 1000
        anim2.fillAfter = true

        binding.txtAnim.startAnimation(anim2)

    }
}