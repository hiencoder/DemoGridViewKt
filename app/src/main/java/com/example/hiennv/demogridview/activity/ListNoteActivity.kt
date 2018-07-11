package com.example.hiennv.demogridview.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.LinearLayout
import butterknife.BindView
import butterknife.ButterKnife
import com.example.hiennv.demogridview.R
import java.text.SimpleDateFormat
import java.util.*

class ListNoteActivity : AppCompatActivity(), OnNoteClickListener{
    @BindView(R.id.rv_notes)
    lateinit var rvNote: RecyclerView
    lateinit var noteAdapter: NoteAdapter

    override fun onClick(note: Note) {

    }

    //https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_note)
        ButterKnife.bind(this)
        //getTimeCreated()
        noteAdapter = NoteAdapter(this,Note.dummyData(),this)
        rvNote.adapter = noteAdapter
        rvNote.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)
    }

    private fun getTimeCreated(): String{
        var result: String = ""
        val timeCurrent = System.currentTimeMillis()
        //convert time -> millisecond
        val date: Date = Date(timeCurrent)
        val sdf: SimpleDateFormat = SimpleDateFormat("E, MM-dd-yyyy HH:mm:ss a")
        sdf.timeZone = TimeZone.getTimeZone("GMT+7")
        result = sdf.format(date)
        Log.d("TimeZone",result)
        return result
    }
}
