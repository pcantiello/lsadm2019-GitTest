package it.unicampania.lsadm.gittest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

// Classe per la main activity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = 10
        val b = a * 2

    }
}
