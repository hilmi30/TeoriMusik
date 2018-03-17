package com.ginanjarmusik.teorimusik.piano

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.RelativeLayout
import com.ginanjarmusik.teorimusik.R

class PianoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_piano)
        val toolbar = findViewById<Toolbar>(R.id.pianoToolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setTitle("Piano")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Mayor ===============================================
        val pianoC = findViewById<RelativeLayout>(R.id.piano_c)
        pianoC.setOnClickListener{
            MediaPlayer.create(this, R.raw.music).start()
        }

        val pianoD = findViewById<RelativeLayout>(R.id.piano_d)
        pianoD.setOnClickListener{
            MediaPlayer.create(this, R.raw.bell).start()
        }

        val pianoE = findViewById<RelativeLayout>(R.id.piano_e)
        pianoE.setOnClickListener{
            MediaPlayer.create(this, R.raw.music).start()
        }

        val pianoF = findViewById<RelativeLayout>(R.id.piano_f)
        pianoF.setOnClickListener{
            MediaPlayer.create(this, R.raw.bell).start()
        }

        val pianoG = findViewById<RelativeLayout>(R.id.piano_g)
        pianoG.setOnClickListener{
            MediaPlayer.create(this, R.raw.music).start()
        }

        val pianoA = findViewById<RelativeLayout>(R.id.piano_a)
        pianoA.setOnClickListener{
            MediaPlayer.create(this, R.raw.bell).start()
        }

        val pianoB = findViewById<RelativeLayout>(R.id.piano_b)
        pianoB.setOnClickListener{
            MediaPlayer.create(this, R.raw.music).start()
        }

        val pianoLastC = findViewById<RelativeLayout>(R.id.piano_c_last)
        pianoLastC.setOnClickListener{
            MediaPlayer.create(this, R.raw.bell).start()
        }

        // Minor =======================================================

    }
}
