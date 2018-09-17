package com.viranika.tourism

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_blank_fragment_rahimabad.*

class MainActivity : AppCompatActivity() {

    var fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val type = Typeface.createFromAsset(assets, "font/IRANSansWeb_Medium.ttf")
        rahimabad_button.setTypeface(type)
        kavir_button.setTypeface(type)
        fork_button.setTypeface(type)
        abgarm_button.setTypeface(type)
        talab_button.setTypeface(type)
    }

    fun showRahimabad (view: View){
        val fragment = fragmentManager.beginTransaction()
        fragment.replace(R.id.frame, BlankFragmentRahimabad())
        fragment.commit()
    }

    fun showHalvan (view: View){
        val fragment = fragmentManager.beginTransaction()
        fragment.replace(R.id.frame, BlankFragmentHalvan())
        fragment.commit()
    }

    fun showFork (view: View){
        val fragment = fragmentManager.beginTransaction()
        fragment.replace(R.id.frame, BlankFragmentFork())
        fragment.commit()
    }

    fun showAbgarm (view: View){
        val fragment = fragmentManager.beginTransaction()
        fragment.replace(R.id.frame, BlankFragmentAbgarm())
        fragment.commit()
    }

    fun showTalab (view: View){
        val fragment = fragmentManager.beginTransaction()
        fragment.replace(R.id.frame, BlankFragmentTalab())
        fragment.commit()
    }
}
