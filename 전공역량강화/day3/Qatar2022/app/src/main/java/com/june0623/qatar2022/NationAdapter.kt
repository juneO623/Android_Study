package com.june0623.qatar2022

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class NationAdapter(context: Context, countries: ArrayList<Nation>): BaseAdapter() {

    val context: Context
    val countries: ArrayList<Nation>
    init {
        this.context = context
        this.countries = countries
    }

    override fun getCount(): Int {
        return countries.size
    }

    override fun getItem(p0: Int): Any {    // position
        return countries[p0]
    }

    override fun getItemId(p0: Int): Long { // position
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {    // position, convertView, parent

        var view:View
        var holder:ViewHolder

        if(p1 == null) {

            val inflater = LayoutInflater.from(context)
            view = inflater.inflate(R.layout.layout_country, p2, false)

            holder = ViewHolder()
            holder.group = view.findViewById(R.id.text_group)
            holder.nationName = view.findViewById(R.id.text_name)
            holder.description = view.findViewById(R.id.text_des)
            holder.imageFlag = view.findViewById(R.id.image_flag)

            view.tag = holder

        } else {
            view = p1
            holder = p1.tag as ViewHolder
        }

        val country = countries[p0]
        holder.group?.text = country.group
        holder.nationName?.text = country.name
        holder.description?.text = country.desc
        holder.imageFlag?.setImageResource(country.flag)

        return view

    }

    inner class ViewHolder {
        var group:TextView? = null
        var nationName:TextView? = null
        var description:TextView? = null
        var imageFlag:ImageView? = null
    }


}