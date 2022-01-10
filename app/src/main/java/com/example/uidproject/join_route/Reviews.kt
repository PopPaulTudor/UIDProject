package com.example.uidproject.join_route

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.uidproject.R
import java.util.ArrayList

class Reviews : AppCompatActivity() {
    lateinit var listView: ListView
    var adapter: ReviewListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reviews)

        displayList()
    }

    fun displayList() {
        listView = findViewById(R.id.review_list)

        val reviewList = mutableListOf<Review>()

        reviewList.add(Review("John", "4/5", "Very kind person!"))
        reviewList.add(Review("Rita", "3/5", "Talks tooooo much bro!"))
        reviewList.add(Review("Bob", "5/5", "My soulmate"))
        reviewList.add(Review("Inka", "1/5", "Tried to steal my stuff!"))

        adapter = ReviewListAdapter(this, reviewList as ArrayList<Review>)
        listView.adapter = adapter
    }
}