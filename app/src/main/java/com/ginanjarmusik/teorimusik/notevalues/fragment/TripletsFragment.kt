package com.ginanjarmusik.teorimusik.notevalues.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ginanjarmusik.teorimusik.R
import com.ginanjarmusik.teorimusik.notevalues.fragment.adapter.NotesAdapter
import com.ginanjarmusik.teorimusik.notevalues.fragment.adapter.TripletsAdapter
import com.ginanjarmusik.teorimusik.notevalues.fragment.data.NotesDatas
import com.ginanjarmusik.teorimusik.notevalues.fragment.data.TripletsDatas


/**
 * A simple [Fragment] subclass.
 */
class TripletsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater!!.inflate(R.layout.fragment_triplets, container, false)

        val recy = v.findViewById<RecyclerView>(R.id.tripletsRecy)
        recy.layoutManager = LinearLayoutManager(context)
        val recyData = ArrayList<TripletsDatas>()
        val adapter = TripletsAdapter(context, setData(recyData))
        recy.adapter = adapter

        return v
    }

    private fun setData(recyData: ArrayList<TripletsDatas>): List<TripletsDatas> {

        recyData.add(TripletsDatas(
                R.mipmap.ic_launcher,
                R.raw.music,
                "ssdfsddsf",
                "sdfdsfds"
        ))

        recyData.add(TripletsDatas(
                R.mipmap.ic_launcher,
                R.raw.music,
                "ssdfsddsf",
                "sdfdsfds"
        ))

        recyData.add(TripletsDatas(
                R.mipmap.ic_launcher,
                R.raw.music,
                "ssdfsddsf",
                "sdfdsfds"
        ))

        return recyData
    }

}
