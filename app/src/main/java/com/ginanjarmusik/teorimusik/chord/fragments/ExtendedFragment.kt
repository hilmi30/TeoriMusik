package com.ginanjarmusik.teorimusik.chord.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ginanjarmusik.teorimusik.R
import com.ginanjarmusik.teorimusik.chord.fragments.adapter.ExtendedAdapter
import com.ginanjarmusik.teorimusik.chord.fragments.data.ExtendedDatas


/**
 * A simple [Fragment] subclass.
 */
class ExtendedFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.fragment_extended, container, false)

        val recy = v.findViewById<RecyclerView>(R.id.recyEx)
        recy.layoutManager = LinearLayoutManager(context)

        val exData = ArrayList<ExtendedDatas>()

        val adapter = ExtendedAdapter(context, setData(exData))
        recy.adapter = adapter

        return v
    }

    private fun setData(exData: ArrayList<ExtendedDatas>): List<ExtendedDatas> {
        exData.add(ExtendedDatas(
                R.mipmap.ic_launcher, R.raw.music,
                "Major",
                "Root1", "Root2", "Root3", "Root4", "Root5",
                "G", "F", "G", "J", "K"
        ))

        exData.add(ExtendedDatas(
                R.mipmap.ic_launcher, R.raw.music,
                "Minor",
                "Root1", "Root2", "Root3", "Root4", "Root5",
                "G", "F", "G", "J", "K"
        ))

        return exData
    }

}
