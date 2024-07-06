package com.developer.android.dev.technologia.androidapp.sprightly.presentation.category

import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
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
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.embodary,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.embodary,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.embodary,"Flower"),
            Category("1",R.drawable.flower,"Flower"),
            Category("1",R.drawable.flower,"Flower")
        )

        categoryAdapter.submitList(list)
        binding.recyclerCategory.adapter=categoryAdapter
        binding.recyclerCategory.layoutManager= GridLayoutManager(requireContext(),2)
//        setLayoutManager()
//        binding.recyclerCategory.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
    }

    private fun setLayoutManager() {
        val configuration = resources.configuration.orientation
        val spanCount = if(configuration == Configuration.ORIENTATION_LANDSCAPE){
            4
        }else{
            2
        }
        binding.recyclerCategory.layoutManager= GridLayoutManager(requireContext(),spanCount)
    }
}