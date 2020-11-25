package com.example.superkahramankitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.resimtransfer_row.view.*

//import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter(val kahramanListesi : ArrayList<String>, val kahramanGorselleri : ArrayList<Bitmap>) : RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>() {

    class SuperKahramanVH(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
        //Inflater, LayoutInflater, MenuInflater
       // val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.resimtransfer_row, parent, false)
        return SuperKahramanVH(itemView)
    }

    override fun getItemCount(): Int {
        return kahramanListesi.size
    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {

        holder.itemView.neacayipyeter.text = kahramanListesi.get(position)
        //holder.itemView.recyclerViewTextView.text = kahramanListesi.get(position)
       // holder.itemView.neacayipyeter.tex

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,Tanitim::class.java)
            intent.putExtra("superKahramanIsmi",kahramanListesi.get(position))
            // intent.putExtra("superKahramanResmi",kahramanGorselleri.get(position))


            val singleton = SingletonClass.SecilenKahraman
            singleton.Resmi = kahramanGorselleri.get(position)

            holder.itemView.context.startActivity(intent)
        }



    }

}