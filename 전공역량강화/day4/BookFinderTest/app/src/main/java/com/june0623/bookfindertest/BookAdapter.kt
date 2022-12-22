package com.june0623.bookfindertest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(val context: Context,  val books:ArrayList<Book>):RecyclerView.Adapter<BookAdapter.ViewHolder>() {

    fun add(book:Book){
        books.add(book)
    }

    fun clear(){
        books.clear()
    }

    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view) {
        var imageView:ImageView
        var textTitle:TextView
        var textPublisher:TextView

        init {
            imageView = view.findViewById(R.id.image_book)
            textTitle = view.findViewById(R.id.text_title)
            textPublisher = view.findViewById(R.id.text_publisher)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        var view = inflater.inflate(R.layout.book_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book = books[position]
//        holder.imageView.setImageResource(book.)
        holder.textTitle.text = book.title
        holder.textPublisher.text = book.publisher
    }

    override fun getItemCount(): Int {
        return books.size
    }

}