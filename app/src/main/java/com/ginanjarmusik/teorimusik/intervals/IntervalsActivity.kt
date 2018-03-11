package com.ginanjarmusik.teorimusik.intervals

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.widget.Toolbar
import com.ginanjarmusik.teorimusik.R
import com.ginanjarmusik.teorimusik.intervals.fragments.InfoFragment
import com.ginanjarmusik.teorimusik.intervals.fragments.M9P15Fragment
import com.ginanjarmusik.teorimusik.intervals.fragments.P1P8Fragment

class IntervalsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intervals)

        // Panggil toolbar
        val toolbar = findViewById<android.support.v7.widget.Toolbar>(R.id.toolbarIntervals)
        setSupportActionBar(toolbar)
        supportActionBar?.setTitle("Intervals")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Panggil adapter
        val pagerAdapter = IntervalsPagerAdapter(supportFragmentManager)
        // Isi adapter dengan fragment
        pagerAdapter.addFragment(InfoFragment(), "INFO")
        pagerAdapter.addFragment(P1P8Fragment(), "P1 - P8")
        pagerAdapter.addFragment(M9P15Fragment(), "M9 - P15")
        // Set adapter ke pager
        val viewPager = findViewById<ViewPager>(R.id.pagerIntervals)
        // Set Limit Pager
        viewPager.offscreenPageLimit = 2
        viewPager.adapter = pagerAdapter

        // Set pager ke tab layout
        val tab = findViewById<TabLayout>(R.id.tabIntervals)
        tab.setupWithViewPager(viewPager)
    }
}
