package com.OxGomer.exchangerates.presentations.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.OxGomer.exchangerates.R
import com.OxGomer.exchangerates.presentations.ViewPagerAdapter
import com.OxGomer.exchangerates.databinding.FragmentRootBinding
import com.google.android.material.tabs.TabLayoutMediator

class RootFragment : Fragment() {

    lateinit var binding: FragmentRootBinding

    private var ctx: Context ?= null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctx = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRootBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tabLayout.tabIconTint = null
        binding.viewPager.adapter = ViewPagerAdapter(ctx as FragmentActivity)
        TabLayoutMediator(binding.tabLayout, binding.viewPager){
            tab, pos ->
            when(pos){
                0 -> {
                    tab.setText("Курс валют")
                    tab.setIcon(R.drawable.baseline_monetization_on_24)
                }

                1 -> {
                    tab.setText("Активи")
                    tab.setIcon(R.drawable.baseline_euro_24)
                }
            }
        }.attach()
    }
}