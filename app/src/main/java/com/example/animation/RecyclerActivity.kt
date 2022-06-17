package com.example.animation

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.animation.adapter.RecyclerAdapter
import com.example.animation.databinding.ActivityRecyclerBinding
import ir.dunijet.animation.ext.BaseActivity

class RecyclerActivity : BaseActivity() {

    private lateinit var binding: ActivityRecyclerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listData = listOf(
            "Test",
            "Test",
            "Test",
            "Test",
            "Test",
            "Test",
            "Test",
            "Test",
            "Test",
            "Test",
            "Test",
            "Test",
            "Test",
            "Test",
            "Test",
            "Test",
        )

        binding.recyclerMain.layoutManager = LinearLayoutManager(this)
        binding.recyclerMain.adapter = RecyclerAdapter(listData)

    }
}