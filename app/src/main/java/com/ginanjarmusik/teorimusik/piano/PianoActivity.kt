package com.ginanjarmusik.teorimusik.piano

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.ginanjarmusik.teorimusik.R

class PianoActivity : AppCompatActivity() {

    //val VALUE_PARAM = "value_param"
    var valueParam = 1

    var pianoKeyC: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_piano)
        val toolbar = findViewById<Toolbar>(R.id.pianoToolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setTitle("Piano")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        pianoKeyC = findViewById(R.id.piano_key_c)
        if(valueParam == 1){
            pianoKeyC?.text = getString(R.string.c4)
        }

        val imgPlus = findViewById<ImageView>(R.id.img_plus)
        val imgMin = findViewById<ImageView>(R.id.img_min)

        imgMin.setOnClickListener {
            valueParam -= 1
            imgPlus.visibility = View.VISIBLE
            if(valueParam <= 0){
                valueParam = 0
                imgMin.visibility = View.GONE
            }
            checkKeyText()
            //Log.d(VALUE_PARAM, "param = $valueParam")
        }

        imgPlus.setOnClickListener {
            valueParam += 1
            imgMin.visibility = View.VISIBLE
            if(valueParam >= 2){
                valueParam = 2
                imgPlus.visibility = View.GONE
            }
            checkKeyText()
            //Log.d(VALUE_PARAM, "param = $valueParam")
        }

        // Mayor ===============================================
        val pianoC = findViewById<RelativeLayout>(R.id.piano_c)
        pianoC.setOnClickListener{
            when(valueParam){
                0 -> MediaPlayer.create(this, R.raw.music).start()
                1 -> MediaPlayer.create(this, R.raw.bell).start()
                2 -> MediaPlayer.create(this, R.raw.music).start()
            }
        }

        val pianoD = findViewById<RelativeLayout>(R.id.piano_d)
        pianoD.setOnClickListener{
            when(valueParam){
                0 -> MediaPlayer.create(this, R.raw.music).start()
                1 -> MediaPlayer.create(this, R.raw.bell).start()
                2 -> MediaPlayer.create(this, R.raw.music).start()
            }
        }

        val pianoE = findViewById<RelativeLayout>(R.id.piano_e)
        pianoE.setOnClickListener{
            when(valueParam){
                0 -> MediaPlayer.create(this, R.raw.music).start()
                1 -> MediaPlayer.create(this, R.raw.bell).start()
                2 -> MediaPlayer.create(this, R.raw.music).start()
            }
        }

        val pianoF = findViewById<RelativeLayout>(R.id.piano_f)
        pianoF.setOnClickListener{
            when(valueParam){
                0 -> MediaPlayer.create(this, R.raw.music).start()
                1 -> MediaPlayer.create(this, R.raw.bell).start()
                2 -> MediaPlayer.create(this, R.raw.music).start()
            }
        }

        val pianoG = findViewById<RelativeLayout>(R.id.piano_g)
        pianoG.setOnClickListener{
            when(valueParam){
                0 -> MediaPlayer.create(this, R.raw.music).start()
                1 -> MediaPlayer.create(this, R.raw.bell).start()
                2 -> MediaPlayer.create(this, R.raw.music).start()
            }
        }

        val pianoA = findViewById<RelativeLayout>(R.id.piano_a)
        pianoA.setOnClickListener{
            when(valueParam){
                0 -> MediaPlayer.create(this, R.raw.music).start()
                1 -> MediaPlayer.create(this, R.raw.bell).start()
                2 -> MediaPlayer.create(this, R.raw.music).start()
            }
        }

        val pianoB = findViewById<RelativeLayout>(R.id.piano_b)
        pianoB.setOnClickListener{
            when(valueParam){
                0 -> MediaPlayer.create(this, R.raw.music).start()
                1 -> MediaPlayer.create(this, R.raw.bell).start()
                2 -> MediaPlayer.create(this, R.raw.music).start()
            }
        }

        val pianoLastC = findViewById<RelativeLayout>(R.id.piano_c_last)
        pianoLastC.setOnClickListener{
            when(valueParam){
                0 -> MediaPlayer.create(this, R.raw.music).start()
                1 -> MediaPlayer.create(this, R.raw.bell).start()
                2 -> MediaPlayer.create(this, R.raw.music).start()
            }
        }

        // Minor =======================================================
        val minorDb = findViewById<RelativeLayout>(R.id.minor_Db)
        minorDb.setOnClickListener {
            when(valueParam){
                0 -> MediaPlayer.create(this, R.raw.music).start()
                1 -> MediaPlayer.create(this, R.raw.bell).start()
                2 -> MediaPlayer.create(this, R.raw.music).start()
            }
        }

        val minorEb = findViewById<RelativeLayout>(R.id.minor_Eb)
        minorEb.setOnClickListener {
            when(valueParam){
                0 -> MediaPlayer.create(this, R.raw.music).start()
                1 -> MediaPlayer.create(this, R.raw.bell).start()
                2 -> MediaPlayer.create(this, R.raw.music).start()
            }
        }

        val minorGb = findViewById<RelativeLayout>(R.id.minor_Gb)
        minorGb.setOnClickListener {
            when(valueParam){
                0 -> MediaPlayer.create(this, R.raw.music).start()
                1 -> MediaPlayer.create(this, R.raw.bell).start()
                2 -> MediaPlayer.create(this, R.raw.music).start()
            }
        }

        val minorAb = findViewById<RelativeLayout>(R.id.minor_Ab)
        minorAb.setOnClickListener {
            when(valueParam){
                0 -> MediaPlayer.create(this, R.raw.music).start()
                1 -> MediaPlayer.create(this, R.raw.bell).start()
                2 -> MediaPlayer.create(this, R.raw.music).start()
            }
        }

        val minorBb = findViewById<RelativeLayout>(R.id.minor_Bb)
        minorBb.setOnClickListener {
            when(valueParam){
                0 -> MediaPlayer.create(this, R.raw.music).start()
                1 -> MediaPlayer.create(this, R.raw.bell).start()
                2 -> MediaPlayer.create(this, R.raw.music).start()
            }
        }
    }

    private fun checkKeyText() {
        when (valueParam){
            0 -> pianoKeyC?.text = getString(R.string.c3)
            1 -> pianoKeyC?.text = getString(R.string.c4)
            2 -> pianoKeyC?.text = getString(R.string.c5)
            else -> pianoKeyC?.text = getString(R.string.c)
        }
    }
}
