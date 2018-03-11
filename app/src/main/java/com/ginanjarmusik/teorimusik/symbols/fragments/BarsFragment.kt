package com.ginanjarmusik.teorimusik.symbols.fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ginanjarmusik.teorimusik.R
import com.ginanjarmusik.teorimusik.notevalues.fragment.adapter.TripletsAdapter
import com.ginanjarmusik.teorimusik.notevalues.fragment.data.TripletsDatas
import com.ginanjarmusik.teorimusik.symbols.fragments.adapter.BarsAdapter
import com.ginanjarmusik.teorimusik.symbols.fragments.data.BarsDatas

class BarsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.fragment_bars, container, false)

        val recy = v.findViewById<RecyclerView>(R.id.barsRecy)
        recy.layoutManager = LinearLayoutManager(context)
        val recyData = ArrayList<BarsDatas>()
        val adapter = BarsAdapter(context, setData(recyData))
        recy.adapter = adapter

        return v
    }

    private fun setData(recyData: ArrayList<BarsDatas>): List<BarsDatas> {

        recyData.add(BarsDatas(
                R.mipmap.ic_launcher,
                "ssdfsddsf",
                "sdfdsfds"
        ))

        recyData.add(BarsDatas(
                R.mipmap.ic_launcher,
                "ssdfsddsf",
                "sdfdsfds"
        ))

        return recyData
    }

}
