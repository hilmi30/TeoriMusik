package com.ginanjarmusik.teorimusik.main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.ginanjarmusik.teorimusik.MainView
import com.ginanjarmusik.teorimusik.R
import com.viewpagerindicator.CirclePageIndicator

class MainActivity : AppCompatActivity(), MainView.HomeView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuData = ArrayList<MenuDatas>()
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Chords"))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Intervals"))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Note Values"))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Rests"))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Circle of Fifths"))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Scales"))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Octaves"))
        menuData.add(MenuDatas(R.mipmap.ic_launcher, "Symbols"))

        val pager = findViewById<ViewPager>(R.id.menuPager)
        val adapter = MenuViewPagerAdapter(applicationContext, menuData, this)
        pager.adapter = adapter

        // Circle indicator
        val circle = findViewById<CirclePageIndicator>(R.id.circleIndicator)
        circle?.setViewPager(pager)
        val density = getResources().getDisplayMetrics().density
        circle?.radius = 5 * density

    }

    override fun goTo(intent: Intent) {
        startActivity(intent)
    }
}
