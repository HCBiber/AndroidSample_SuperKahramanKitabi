package com.example.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

//import kotlinx.android.synthetic.main.activity_main.*

/*

  Hüseyin ÖZÇAKIR

  ozcakirh@hotmail.com

  hcbiber71@gmail.com

  25.11.2020 23:53
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var SuperKahramanIsimleri = ArrayList<String>()

        SuperKahramanIsimleri.add("Ironman")

        SuperKahramanIsimleri.add("Spiderman")

        SuperKahramanIsimleri.add("Superman")

        // VErimsiz Yontem
        // Dikkat Var Değil val

        val  BitmapIronMan = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.ironman)

        val  BitmapSpiderMan = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.spiderman)

        val  BitmapSupeerMan = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.superman)

        var SuperKahramanListeleri = ArrayList<Bitmap>()

        SuperKahramanListeleri.add(BitmapIronMan)

        SuperKahramanListeleri.add(BitmapSpiderMan)

        SuperKahramanListeleri.add(BitmapSupeerMan)

        //Adapter

        val layoutManager = LinearLayoutManager(this)

        ReCylerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(SuperKahramanIsimleri,SuperKahramanListeleri)
        ReCylerView.adapter = adapter




    }
}