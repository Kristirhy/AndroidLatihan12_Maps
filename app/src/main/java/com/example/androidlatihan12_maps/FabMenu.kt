package com.example.androidlatihan12_maps

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class FabMenu : AppCompatActivity() {

    private var fab1: FloatingActionButton? = null
    private var fab2: FloatingActionButton? = null
    private var fab3: FloatingActionButton? = null
    private var fab4: FloatingActionButton? = null
    private var fab: FloatingActionButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab1 = findViewById(R.id.fab1)
        fab2 = findViewById(R.id.fab2)
        fab3 = findViewById(R.id.fab3)
        fab4 = findViewById(R.id.fab4)
        fab = findViewById(R.id.fab)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {


        }
    }
}


