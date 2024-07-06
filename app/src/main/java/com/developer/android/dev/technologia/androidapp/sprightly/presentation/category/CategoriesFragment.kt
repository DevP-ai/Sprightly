package com.developer.android.dev.technologia.androidapp.sprightly.presentation.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.developer.android.dev.technologia.androidapp.sprightly.R
import com.developer.android.dev.technologia.androidapp.sprightly.databinding.FragmentCategoriesBinding
import com.developer.android.dev.technologia.androidapp.sprightly.domain.model.Category

class CategoriesFragment : Fragment() {
    private lateinit var binding:FragmentCategoriesBinding

    private lateinit var categoryAdapter: CategoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCategoriesBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        categoryAdapter= CategoryAdapter()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = arrayListOf(
            Category("1",R.drawable.flower.toString(),"Flower"),
            Category("1",R.drawable.flower.toString(),"Flower"),
            Category("1",R.drawable.flower.toString(),"Flower"),
            Category("1",R.drawable.flower.toString(),"Flower"),
            Category("1",R.drawable.flower.toString(),"Flower"),
            Category("1",R.drawable.flower.toString(),"Flower"),
            Category("1",R.drawable.flower.toString(),"Flower"),
            Category("1",R.drawable.flower.toString(),"Flower"),
            Category("1",R.drawable.flower.toString(),"Flower"),
            Category("1",R.drawable.flower.toString(),"Flower"),
            Category("1",R.drawable.flower.toString(),"Flower"),
            Category("1",R.drawable.flower.toString(),"Flower"),
            Category("1",R.drawable.flower.toString(),"Flower")
        )

        categoryAdapter.submitList(list)
        binding.recyclerCategory.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        binding.recyclerCategory.adapter=categoryAdapter
    }
}