package com.june0623.customadaptertest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class TwiceAdapter(context: Context, members: ArrayList<Twice>): BaseAdapter() {

    val context: Context
    val members: ArrayList<Twice>
    init{
        this.context = context
        this.members = members
    }

    override fun getCount(): Int {
        return members.size
    }

    override fun getItem(p0: Int): Any {    // position
        return  members[p0]
    }

    override fun getItemId(p0: Int): Long { // position
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {    // position, convertView, parent

        var view: View
        var holder: ViewHolder  // 함수 안에 있는 지역변수는 nullable 안 해도됨 null 가질 수 있음

        if (p1 == null){    // convertView == null

            val inflater = LayoutInflater.from(context)
            view = inflater.inflate(R.layout.layout_twice, p2, false)

            // findViewById가 부하가 많이 걸리는 작업이라 한 군데에 미리 저장해놓기
            holder = ViewHolder()
            holder.imageMember = view.findViewById(R.id.image_member)
            holder.txtName = view.findViewById(R.id.text_name)
            holder.txtNick = view.findViewById(R.id.text_nick)
            holder.imageFlag = view.findViewById(R.id.image_flag)

            view.tag = holder

        } else {
            view = p1
            holder = p1.tag as ViewHolder
        }
//
//        val imageMember: ImageView = view.findViewById(R.id.image_member)
//        val txtName: TextView = view.findViewById(R.id.text_name)
//        val txtNick: TextView = view.findViewById(R.id.text_nick)
//        val imageFlag: ImageView = view.findViewById(R.id.image_flag)

        val member = members[p0]
        holder.imageMember?.setImageResource(member.imageId)
        holder.txtName?.text = member.name
        holder.txtNick?.text = member.nick
        holder.imageFlag?.setImageResource(member.flagId)

        return view
    }

    inner class ViewHolder {
        var imageMember: ImageView? = null
        var txtName: TextView? = null
        var txtNick: TextView? = null
        var imageFlag: ImageView? = null
    }

}