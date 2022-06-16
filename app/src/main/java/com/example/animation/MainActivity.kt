package com.example.animation

import android.os.Bundle
import android.view.animation.*
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
        binding.btnAnimAlpha.setOnClickListener {
            startAlphaAnim()
        }
        binding.btnAnimMultiple.setOnClickListener {
            startMultipleAnimation()
        }
        binding.btnAnimRotate.setOnClickListener {
            startRotateAnimation()
        }
        binding.btnAnimScale.setOnClickListener {
            startScaleAnimation()
        }
        binding.btnAnimTranslate.setOnClickListener {
            startTranslateAnimation()
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

    private fun startTranslateAnimation() {
        val anim = TranslateAnimation(
            0f, -50f,
            0f, -100f
        )
        anim.duration = 1000
        anim.fillAfter = true
        anim.interpolator = DecelerateInterpolator()

        binding.txtAnim.startAnimation(anim)
    }

    private fun startRotateAnimation() {
        val anim = RotateAnimation(0f, 360f)
        anim.duration = 1000
        anim.fillAfter = true

        val anim2 = RotateAnimation(
            0f, 360f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f,
        )
        anim2.duration = 1000
        anim2.fillAfter = true

        binding.txtAnim.startAnimation(anim2)
    }

    private fun startMultipleAnimation() {
        // Animation 1 =>
        val anim1 = ScaleAnimation(
            1f, 2f, 1f, 2f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 05f
        )

        // Animation 2 =>
        val anim2 = RotateAnimation(
            0f, 360f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f,
        )

        // Animation Set =>
        val animSet = AnimationSet(true)
        animSet.addAnimation(anim1)
        animSet.addAnimation(anim2)
        animSet.duration = 2000
        animSet.repeatCount = 2
        animSet.fillAfter = true

        binding.txtAnim.startAnimation(animSet)
    }

}