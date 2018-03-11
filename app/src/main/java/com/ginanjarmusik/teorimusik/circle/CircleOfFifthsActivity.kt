package com.ginanjarmusik.teorimusik.circle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import com.ginanjarmusik.teorimusik.R
import kotlinx.android.synthetic.main.activity_circle_of_fifths.*

class CircleOfFifthsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle_of_fifths)
        val toolbar = findViewById<Toolbar>(R.id.toolbarCircle)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
