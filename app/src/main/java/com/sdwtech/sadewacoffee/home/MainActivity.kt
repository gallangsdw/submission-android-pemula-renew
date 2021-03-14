package com.sdwtech.sadewacoffee.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.sdwtech.sadewacoffee.R
import com.sdwtech.sadewacoffee.ViewModel.FoodViewModel
import com.sdwtech.sadewacoffee.adapter.FoodAdapter
import com.sdwtech.sadewacoffee.databinding.ActivityMainBinding
import com.sdwtech.sadewacoffee.detail.AboutActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val btnAbout: ImageView = findViewById(R.id.about)
        btnAbout.setOnClickListener(this)

        val viewModel = ViewModelProvider(
            this, ViewModelProvider.NewInstanceFactory()
        )[FoodViewModel::class.java]

        val foodAdapter = FoodAdapter()

        viewModel.setData()
        viewModel.getData().observe( this, { data ->
            if (data != null) {
                foodAdapter.submitList(data)
            }
        })

        with(binding.rvFood){
            layoutManager = LinearLayoutManager( this@MainActivity)
            setHasFixedSize(true)
            adapter = foodAdapter
            foodAdapter.notifyDataSetChanged()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.about -> {
                val iAbout = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(iAbout)
            }
        }
    }
}