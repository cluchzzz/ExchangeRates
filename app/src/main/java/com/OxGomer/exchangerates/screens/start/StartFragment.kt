package com.OxGomer.exchangerates.screens.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.OxGomer.exchangerates.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    lateinit var binding: FragmentStartBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: StartAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this).get(StartModelView::class.java)
        binding = FragmentStartBinding.inflate(layoutInflater, container, false)

        recyclerView = binding.rvStart
        adapter = StartAdapter()
        recyclerView.adapter = adapter
        viewModel.getCash()
        viewModel.MoneyList.observe(viewLifecycleOwner, {list ->
            list.body()?.let { adapter.setList(it) }
        })

        return binding.root
    }
}