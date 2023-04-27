package com.example.rvupdated

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView


//step1-> inherit RecyclerView.Adapter then create exapleViewHolder in <>
//add constructor invocation and add this class in our class
//pass argument in rcvAdapter and implement member
class rcvAdapter(val requireContext: Context, private val phoneDetails: ArrayList<Modal>):RecyclerView.Adapter<rcvAdapter.exampleViewHolder>() {
   //lateinit var mlistener: onItemClickListener
var onitemclick:(()->Unit)?=null


    class exampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val personName: TextView = itemView.findViewById(R.id.name)
        val personNumber: TextView = itemView.findViewById(R.id.num)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): exampleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        return exampleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return phoneDetails.size
    }


    override fun onBindViewHolder(holder: exampleViewHolder, position: Int) {
        var food=phoneDetails[position]
        holder.personName.text = phoneDetails[position].name
        holder.personNumber.text = phoneDetails[position].number
        holder.itemView.setOnClickListener {
           // onitemclick?.invoke()



        }

    }

}