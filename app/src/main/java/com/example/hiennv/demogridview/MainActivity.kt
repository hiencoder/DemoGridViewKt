package com.example.hiennv.demogridview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import butterknife.BindView
import butterknife.ButterKnife

class MainActivity : AppCompatActivity() {
    @BindView(R.id.gv_book)
    lateinit var gvBook: GridView
    lateinit var bookAdapter: BookAdapter
    val listBook: MutableList<Book> = dummyBook()

    private fun dummyBook(): MutableList<Book> {
        var books: MutableList<Book> = mutableListOf()
        books.add(Book("","","",false))
        books.add(Book("","","",false))
        books.add(Book("","","",false))
        books.add(Book("","","",false))
        books.add(Book("","","",false))
        books.add(Book("","","",false))
        books.add(Book("","","",false))
        books.add(Book("","","",false))
        books.add(Book("","","",false))
        books.add(Book("","","",false))
        books.add(Book("","","",false))
        books.add(Book("","","",false))
        return books
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)

        bookAdapter = BookAdapter(this,listBook)
        gvBook.adapter = bookAdapter

    }
}
