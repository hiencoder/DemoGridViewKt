package com.example.hiennv.demogridview

class Book constructor(name: String, image: String, author: String, isLike: Boolean) {
    private var bookName: String = ""
    private var bookImage: String = ""
    private var bookAuthor: String = ""

    var BookName: String
        get() {
            return bookName
        }
        set(value) {
            bookName = value
        }

    var BookImage: String
        get() {
            return bookImage
        }
        set(value) {
            bookImage = value
        }

    var BookAuthor: String
        get() {
            return bookAuthor
        }
        set(value) {
            bookAuthor = value
        }


    private var isLike: Boolean = false
    var IsLike: Boolean
        get() {
            return isLike
        }
        set(value) {
            isLike = value
        }

}