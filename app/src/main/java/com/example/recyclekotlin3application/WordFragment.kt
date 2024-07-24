package com.example.recyclekotlin3application

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclekotlin3application.databinding.FragmentWordBinding


class WordFragment : Fragment() {

    private lateinit var binding: FragmentWordBinding
    private lateinit var wordAdapter: WordAdapter
    private  var wordList: ArrayList<String> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWordBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        setupRecycleView()
    }

    private fun loadData() {
        wordList.addAll(listOf("Hello", "World", "Kotlin", "Android", "Development"))
    }

    private fun setupRecycleView(){
        wordAdapter = WordAdapter(wordList)
        binding.rvWord.apply {
            layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
            adapter = wordAdapter
            
        }
    }



}