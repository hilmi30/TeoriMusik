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
import com.ginanjarmusik.teorimusik.symbols.fragments.adapter.BarsAdapter
import com.ginanjarmusik.teorimusik.symbols.fragments.adapter.KeyPitchAdapter
import com.ginanjarmusik.teorimusik.symbols.fragments.data.BarsDatas
import com.ginanjarmusik.teorimusik.symbols.fragments.data.KeyPitchDatas

class KeyPitchFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.fragment_key_pitch, container, false)

        val recy = v.findViewById<RecyclerView>(R.id.keyRecy)
        recy.layoutManager = LinearLayoutManager(context)
        val recyData = ArrayList<KeyPitchDatas>()
        val adapter = KeyPitchAdapter(context, setData(recyData))
        recy.adapter = adapter

        return v
    }

    private fun setData(recyData: ArrayList<KeyPitchDatas>): List<KeyPitchDatas> {

        recyData.add(KeyPitchDatas(
                R.mipmap.ic_launcher,
                "ssdfsddsf",
                "sdfdsfds"
        ))

        recyData.add(KeyPitchDatas(
                R.mipmap.ic_launcher,
                "ssdfsddsf",
                "sdfdsfds"
        ))

        recyData.add(KeyPitchDatas(
                R.mipmap.ic_launcher,
                "ssdfsddsf",
                "sdfdsfds"
        ))

        recyData.add(KeyPitchDatas(
                R.mipmap.ic_launcher,
                "ssdfsddsf",
                "sdfdsfds"
        ))

        return recyData
    }

}
