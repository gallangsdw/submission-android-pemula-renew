package com.sdwtech.sadewacoffee.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import coil.transform.RoundedCornersTransformation
import com.sdwtech.sadewacoffee.data.Food
import com.sdwtech.sadewacoffee.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val EXTRA_DETAIL = "extra_detail"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val food = intent.getParcelableExtra<Food>(EXTRA_DETAIL)

        binding.backArrow.setOnClickListener{
            finish()
        }

        binding.detailPhoto.load(food?.photo) {
            transformations(RoundedCornersTransformation(20f))
        }
        binding.tvDetailName.text = food?.name
        binding.detailDesc.text = food?.description
        binding.detailPrice.text = food?.price
    }

}