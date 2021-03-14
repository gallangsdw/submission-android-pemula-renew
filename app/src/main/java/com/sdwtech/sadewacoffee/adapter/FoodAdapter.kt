package com.sdwtech.sadewacoffee.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.RoundedCornersTransformation
import com.sdwtech.sadewacoffee.data.Food
import com.sdwtech.sadewacoffee.databinding.ItemFoodBinding
import com.sdwtech.sadewacoffee.detail.DetailActivity

class FoodAdapter: RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    private var listFood = mutableListOf<Food>()

    fun submitList(food: List<Food>) {
        listFood.clear()
        listFood.addAll(food)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
                ItemFoodBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent, false
                )
        )
    }

    override fun onBindViewHolder(holder: FoodAdapter.ViewHolder, position: Int) {
        holder.bind(listFood[position])
    }

    override fun getItemCount(): Int = listFood.size

    class ViewHolder(private val binding: ItemFoodBinding):
            RecyclerView.ViewHolder(binding.root) {
                fun bind(food:Food) {
                    binding.tvItemName.text = food.name
                    binding.tvItemDescription.text = food.description
                    binding.imgItemPhoto.load(food.photo) {
                        transformations(RoundedCornersTransformation(20f))
                    }

                    itemView.setOnClickListener {
                        val detail = Intent(itemView.context, DetailActivity::class.java)
                        detail.putExtra(DetailActivity.EXTRA_DETAIL, food)
                        itemView.context.startActivity(detail)
                    }

                }
            }
}