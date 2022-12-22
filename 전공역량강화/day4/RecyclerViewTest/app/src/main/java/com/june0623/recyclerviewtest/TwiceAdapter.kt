package com.june0623.recyclerviewtest

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class TwiceAdapter(val context: Context, val members: ArrayList<Twice>): RecyclerView.Adapter<TwiceAdapter.ViewHolder>() {

    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val imageMember:ImageView
        val txtName:TextView
        val txtNick:TextView
        val imageFlag:ImageView

        init {
            imageMember = view.findViewById(R.id.image_member)
            txtName = view.findViewById(R.id.text_name)
            txtNick = view.findViewById(R.id.text_nick)
            imageFlag = view.findViewById(R.id.image_flag)

            view.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION){
                    val member = members[position]
                    Toast.makeText(context, member.name, Toast.LENGTH_SHORT).show()

                    val intent = Intent(context, DetailActivity::class.java)
                    intent.putExtra("member", member)
                    context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val itemView = layoutInflater.inflate(R.layout.layout_item, parent, false)
        val holder = ViewHolder(itemView)

        return holder

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val member = members[position]
        holder.imageMember.setImageResource(member.imageId)
        holder.txtName.text = member.name
        holder.txtNick.text = member.nick
        holder.imageFlag.setImageResource(member.flagId)
    }

    override fun getItemCount(): Int {
        return members.size
    }

}