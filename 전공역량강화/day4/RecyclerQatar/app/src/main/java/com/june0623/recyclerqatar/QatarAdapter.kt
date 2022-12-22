package com.june0623.recyclerqatar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class QatarAdapter(context:Context, nations:ArrayList<Nation>):RecyclerView.Adapter<QatarAdapter.ViewHolder>() {

    val context:Context
    val nations:ArrayList<Nation>

    init {
        this.context = context
        this.nations = nations
    }

    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val imageFlag:ImageView
        val txtName:TextView
        val txtGroup:TextView
        init {
            imageFlag = view.findViewById(R.id.image_flag)
            txtName = view.findViewById(R.id.text_name)
            txtGroup = view.findViewById(R.id.text_group)

            view.setOnClickListener {
                val pos = adapterPosition

                if (pos != RecyclerView.NO_POSITION){
                    val nation = nations[pos]
                    Toast.makeText(context, nation.name, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view:View = inflater.inflate(R.layout.layout_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nation = nations[position]
        holder.imageFlag.setImageResource(nation.flag)
        holder.txtName.text = nation.name
        holder.txtGroup.text = nation.group
    }

    override fun getItemCount(): Int {
        return nations.size
    }

}