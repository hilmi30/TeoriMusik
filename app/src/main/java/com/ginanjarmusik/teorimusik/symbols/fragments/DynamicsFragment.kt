package com.ginanjarmusik.teorimusik.symbols.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ginanjarmusik.teorimusik.R
import com.ginanjarmusik.teorimusik.chord.fragments.adapter.TriadsAdapter
import com.ginanjarmusik.teorimusik.chord.fragments.data.TriadsDatas
import com.ginanjarmusik.teorimusik.symbols.fragments.adapter.DynamicsAdapter
import com.ginanjarmusik.teorimusik.symbols.fragments.data.DynamicsDatas


/**
 * A simple [Fragment] subclass.
 */
class DynamicsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.fragment_dynamics, container, false)

        val recy = v.findViewById<RecyclerView>(R.id.dynamicsRecy)
        recy.layoutManager = GridLayoutManager(context, 2)

        val recyData = ArrayList<DynamicsDatas>()

        val adapter = DynamicsAdapter(context, setData(recyData))
        recy.adapter = adapter

        return v
    }

    private fun setData(recyData: ArrayList<DynamicsDatas>): List<DynamicsDatas> {
        recyData.add(DynamicsDatas(
                "Piano pianissiom",
                "ppp",
                "Softest!"
        ))

        recyData.add(DynamicsDatas(
                "Piano pianissiom",
                "pp",
                "Softest!"
        ))

        return recyData
    }

}
