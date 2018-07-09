package com.example.hiennv.demogridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import com.squareup.picasso.Picasso

class BookAdapter : BaseAdapter {
    lateinit var context: Context
    lateinit var books: List<Book>

    constructor(context: Context, books: List<Book>) : super() {
        this.context = context
        this.books = books
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        var view: View = LayoutInflater.from(context).inflate(R.layout.item_book_case,null)
        var ivBook: ImageView = view.findViewById(R.id.iv_book)
        var tvBookName: TextView = view.findViewById(R.id.tv_book_name)
        var tvBookAuthor: TextView = view.findViewById(R.id.tv_book_author)
        var rbLike: RatingBar = view.findViewById(R.id.rb_like)

        val book: Book = books.get(position)
        Picasso.with(context).load(book.BookImage).into(ivBook)
        tvBookName.text = book.BookName
        tvBookAuthor.text = book.BookAuthor
        rbLike.setOnRatingBarChangeListener { ratingBar, fl, b -> !book.IsLike }

        return view
    }

    override fun getItem(position: Int): Any {
        return books.get(position)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return books.size
    }

    class ViewHolder{
        var ivBook: ImageView? = null
        var tvBookName: TextView? = null
        var tvBookAuthor: TextView? = null
        var rbLike: RatingBar? = null
    }
}