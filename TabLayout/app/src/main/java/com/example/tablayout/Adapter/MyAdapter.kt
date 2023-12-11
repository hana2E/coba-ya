package com.example.tablayout.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.tablayout.Fragment.HomeFragment
import com.example.tablayout.Fragment.ProfileFragment
import com.example.tablayout.Fragment.SettingFragment

internal class MyAdapter(val context: Context, val fm: FragmentManager, val totalTab:Int ) : FragmentStatePagerAdapter (fm) {

    override fun getItem(position: Int): Fragment {

        return when(position){
            0 -> {
                HomeFragment()
            }
            1 -> {
                SettingFragment()
            }
            2 -> {
                ProfileFragment()
            }
            else -> getItem(position)

        }
    }
    override fun getCount(): Int {

        return totalTab
    }

}