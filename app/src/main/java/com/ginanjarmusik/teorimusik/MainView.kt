package com.ginanjarmusik.teorimusik

import android.content.Intent

/**
 * Created by mrdoyon on 2/27/18.
 */
class MainView{
    interface HomeView{
        fun goTo(intent: Intent)
    }
    interface ScalesView{
        fun changeText(judul: String, image: Int, exText: String, sound: Int)
    }
}