package com.developer.android.dev.technologia.androidapp.sprightly.presentation.home

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.OptIn
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.developer.android.dev.technologia.androidapp.sprightly.R
import com.developer.android.dev.technologia.androidapp.sprightly.databinding.FragmentHomeBinding
import com.developer.android.dev.technologia.androidapp.sprightly.domain.model.Category
import com.developer.android.dev.technologia.androidapp.sprightly.presentation.category.CategoryAdapter
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.badge.BadgeUtils
import com.google.android.material.badge.ExperimentalBadgeUtils

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var homeCategoryAdapter: HomeCategoryAdapter
    private lateinit var categoryAdapter: CategoryAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        homeCategoryAdapter = HomeCategoryAdapter()
        categoryAdapter = CategoryAdapter()
        return binding.root
    }

    @OptIn(ExperimentalBadgeUtils::class)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       binding.favBadgeText.text= "10"

        val list = arrayListOf(
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower")
        )

        homeCategoryAdapter.submitList(list)
        binding.recyclerHomeCategory.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        binding.recyclerHomeCategory.adapter = homeCategoryAdapter

        categoryAdapter.submitList(list)
        binding.recyclerHomeRecommended.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        binding.recyclerHomeRecommended.adapter = categoryAdapter
    }

}