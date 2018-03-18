package com.ginanjarmusik.teorimusik.main

import android.content.Context
import android.content.Intent
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.ginanjarmusik.teorimusik.MainView
import com.ginanjarmusik.teorimusik.R
import com.ginanjarmusik.teorimusik.chord.ChordActivity
import com.ginanjarmusik.teorimusik.circle.CircleOfFifthsActivity
import com.ginanjarmusik.teorimusik.intervals.IntervalsActivity
import com.ginanjarmusik.teorimusik.notevalues.NoteValuesActivity
import com.ginanjarmusik.teorimusik.octaves.OctavesActivity
import com.ginanjarmusik.teorimusik.piano.PianoActivity
import com.ginanjarmusik.teorimusik.rests.RestsActivity
import com.ginanjarmusik.teorimusik.scales.ScalesActivity
import com.ginanjarmusik.teorimusik.symbols.SymbolsActivity
import com.ginanjarmusik.teorimusik.test.TestActivity

/**
 * Created by mrdoyon on 2/28/18.
 */
class MenuViewPagerAdapter(val c: Context, val menuDatas: List<MenuDatas>, val view: MainView.HomeView): PagerAdapter() {

    override fun isViewFromObject(view: View?, `object`: Any?): Boolean =
            view == `object` as RelativeLayout

    override fun getCount(): Int = menuDatas.size

    override fun instantiateItem(container: ViewGroup?, position: Int): Any {
        val v = LayoutInflater.from(container?.context).inflate(R.layout.row_menu, container, false)

        val menu = menuDatas[position]

        val img = v.findViewById<ImageView>(R.id.menuImg)
        val title = v.findViewById<TextView>(R.id.menuTitle)

        img.setImageResource(menu.img)
        title.text = menu.title

        img.setOnClickListener {
            when{
                position == 0 -> {
                    val intent = Intent(c, ChordActivity::class.java)
                    view.goTo(intent)
                }
                position == 1 -> {
                    val intent = Intent(c, IntervalsActivity::class.java)
                    view.goTo(intent)
                }
                position == 2 -> {
                    val intent = Intent(c, NoteValuesActivity::class.java)
                    view.goTo(intent)
                }
                position == 3 -> {
                    val intent = Intent(c, RestsActivity::class.java)
                    view.goTo(intent)
                }
                position == 4 -> {
                    val intent = Intent(c, CircleOfFifthsActivity::class.java)
                    view.goTo(intent)
                }
                position == 5 -> {
                    val intent = Intent(c, ScalesActivity::class.java)
                    view.goTo(intent)
                }
                position == 6 -> {
                    val intent = Intent(c, OctavesActivity::class.java)
                    view.goTo(intent)
                }
                position == 7 -> {
                    val intent = Intent(c, SymbolsActivity::class.java)
                    view.goTo(intent)
                }
                position == 8 -> {
                    val intent = Intent(c, PianoActivity::class.java)
                    view.goTo(intent)
                }
                position == 9 -> {
                    val intent = Intent(c, TestActivity::class.java)
                    view.goTo(intent)
                }
            }
        }

        container?.addView(v)

        return v
    }

    override fun destroyItem(container: ViewGroup?, position: Int, `object`: Any?) {
        container?.removeView(`object` as RelativeLayout)
    }
}