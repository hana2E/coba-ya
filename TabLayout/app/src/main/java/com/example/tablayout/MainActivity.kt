package com.example.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablayout.Adapter.MyAdapter
import com.example.tablayout.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tablayout.addTab(binding.tablayout.newTab().setText("Home"))
        binding.tablayout.addTab(binding.tablayout.newTab().setText("Setting"))
        binding.tablayout.addTab(binding.tablayout.newTab().setText("Profile"))
        binding.tablayout.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = MyAdapter(this,supportFragmentManager,binding.tablayout.tabCount)
        binding.viewpager.adapter = adapter
        binding.viewpager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(binding.tablayout))
        binding.tablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                binding.viewpager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        } )

    }
}