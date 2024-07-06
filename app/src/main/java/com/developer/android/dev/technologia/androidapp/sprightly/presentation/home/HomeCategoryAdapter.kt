package com.developer.android.dev.technologia.androidapp.sprightly.presentation.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.developer.android.dev.technologia.androidapp.sprightly.databinding.CategoryDesignLayoutBinding
import com.developer.android.dev.technologia.androidapp.sprightly.databinding.HomeCategoryDesignBinding
import com.developer.android.dev.technologia.androidapp.sprightly.domain.model.Category

class HomeCategoryAdapter :
    ListAdapter<Category, HomeCategoryAdapter.HomeCategoryViewHolder>(CategoryDiffUtil()) {

    inner class HomeCategoryViewHolder(val binding: HomeCategoryDesignBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeCategoryViewHolder {
        return HomeCategoryViewHolder(HomeCategoryDesignBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: HomeCategoryViewHolder, position: Int) {
        val category = getItem(position)
        holder.binding.categoryName.text= category.title
        holder.binding.categoryImage.setImageResource(category.image)
//        Glide.with(holder.itemView)
//            .load(category.image)
//            .into(holder.binding.categoryImage)
    }


    class CategoryDiffUtil : DiffUtil.ItemCallback<Category>() {
        override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean {
            return oldItem.cId == newItem.cId
        }

    }

}