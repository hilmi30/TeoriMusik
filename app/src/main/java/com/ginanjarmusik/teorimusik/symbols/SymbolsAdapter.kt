package com.ginanjarmusik.teorimusik.symbols

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by mrdoyon on 3/4/18.
 */
class SymbolsAdapter(fm: android.support.v4.app.FragmentManager): FragmentPagerAdapter(fm) {

    var mFragmentItems: ArrayList<Fragment> = ArrayList()
    var mFragmentTitles: ArrayList<String> = ArrayList()

    fun addFragment(fragmentItem: Fragment, fragmentTitle: String){
        mFragmentItems.add(fragmentItem)
        mFragmentTitles.add(fragmentTitle)
    }

    override fun getItem(position: Int): Fragment = mFragmentItems[position]

    override fun getCount(): Int = mFragmentItems.size

    override fun getPageTitle(position: Int): CharSequence = mFragmentTitles[position]
}