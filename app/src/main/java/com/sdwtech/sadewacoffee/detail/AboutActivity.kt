package com.sdwtech.sadewacoffee.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sdwtech.sadewacoffee.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.backArrow.setOnClickListener{
            finish()
        }
    }
}