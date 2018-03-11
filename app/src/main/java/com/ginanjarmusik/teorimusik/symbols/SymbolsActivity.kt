package com.ginanjarmusik.teorimusik.symbols

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import com.ginanjarmusik.teorimusik.R
import com.ginanjarmusik.teorimusik.chord.ChordAdapter
import com.ginanjarmusik.teorimusik.chord.fragments.ExtendedFragment
import com.ginanjarmusik.teorimusik.chord.fragments.FourVoiceFragment
import com.ginanjarmusik.teorimusik.chord.fragments.TriadsFragment
import com.ginanjarmusik.teorimusik.symbols.fragments.ArticulationFragment
import com.ginanjarmusik.teorimusik.symbols.fragments.BarsFragment
import com.ginanjarmusik.teorimusik.symbols.fragments.DynamicsFragment
import com.ginanjarmusik.teorimusik.symbols.fragments.KeyPitchFragment

class SymbolsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symbols)

        val toolbarToko = findViewById<android.support.v7.widget.Toolbar>(R.id.symbolsToolbar)
        setSupportActionBar(toolbarToko)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("Symbols")

        val sectionPager = SymbolsAdapter(supportFragmentManager)

        sectionPager.addFragment(DynamicsFragment(), "DYNAMICS")
        sectionPager.addFragment(ArticulationFragment(), "ARTICULATION")
        sectionPager.addFragment(BarsFragment(), "BARS")
        sectionPager.addFragment(KeyPitchFragment(), "KEY AND PITCH")

        val viewPager = findViewById<ViewPager>(R.id.symbolsPager)
        viewPager.offscreenPageLimit = 3
        viewPager.adapter = sectionPager

        val tabToko = findViewById<TabLayout>(R.id.symbolsTab)
        tabToko.setupWithViewPager(viewPager)

    }
}
