package com.OxGomer.exchangerates.presentations.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.OxGomer.exchangerates.databinding.FragmentStartBinding

class SecondFragment : Fragment() {

    lateinit var binding: FragmentStartBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: SecondAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this).get(SecondModelView::class.java)
        binding = FragmentStartBinding.inflate(layoutInflater, container, false)

        recyclerView = binding.rvStart
        adapter = SecondAdapter()
        recyclerView.adapter = adapter
        viewModel.getReserve()
        viewModel.MoneyList.observe(viewLifecycleOwner, {list ->
            list.body()?.let { adapter.setList(it) }
        })

        return binding.root
    }
}