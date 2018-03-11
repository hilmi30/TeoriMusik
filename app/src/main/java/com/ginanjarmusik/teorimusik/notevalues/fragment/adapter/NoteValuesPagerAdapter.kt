package com.ginanjarmusik.teorimusik.notevalues.fragment.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by mrdoyon on 3/2/18.
 */
class NoteValuesPagerAdapter(fm: android.support.v4.app.FragmentManager): FragmentPagerAdapter(fm){

    val fragmentItem: ArrayList<Fragment> = ArrayList()
    val fragmentTitle: ArrayList<String> = ArrayList()

    fun addFragment(item: Fragment, title: String){
        fragmentItem.add(item)
        fragmentTitle.add(title)
    }

    override fun getItem(position: Int): Fragment {
        return fragmentItem[position]
    }

    override fun getCount(): Int {
        return fragmentItem.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return fragmentTitle[position]
    }

}