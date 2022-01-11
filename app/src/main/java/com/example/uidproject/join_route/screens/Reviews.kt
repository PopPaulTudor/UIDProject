package com.example.uidproject.join_route.screens

import android.os.Bundle
import android.widget.ListView
import com.example.uidproject.BaseActivity
import com.example.uidproject.R
import com.example.uidproject.join_route.adapters.ReviewListAdapter
import com.example.uidproject.join_route.models.Review
import java.util.ArrayList

class Reviews : BaseActivity() {
    lateinit var listView: ListView
    var adapter: ReviewListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reviews)

        displayList()
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_reviews
    }

    override fun getBottomNavigationMenuItemId(): Int {
        return R.id.action_home
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