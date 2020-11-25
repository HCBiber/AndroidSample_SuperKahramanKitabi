package com.example.superkahramankitabi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tanitim.*

class Tanitim : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)

        val Gelen_Intent =  intent
        val SecilenKahramanIsmi = Gelen_Intent.getStringExtra("superKahramanIsmi")
        //val SecilenKahramanResmi = Gelen_Intent.getStringExtra("superKahramanResmi")

        KahramanAdi.text = SecilenKahramanIsmi

        val SecilenKahraman = SingletonClass.SecilenKahraman
        val SecilenGorsel = SecilenKahraman.Resmi

        KahramanResmi.setImageBitmap(SecilenGorsel)




    }
}