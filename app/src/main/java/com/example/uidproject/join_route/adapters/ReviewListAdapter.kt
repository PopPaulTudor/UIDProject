package com.example.uidproject.join_route.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.uidproject.R
import com.example.uidproject.join_route.models.Review

class ReviewListAdapter(private val context: Context, private val arrayList: java.util.ArrayList<Review>) : BaseAdapter() {
    private lateinit var user: TextView
    private lateinit var rating: TextView
    private lateinit var review: TextView

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var convertView = convertView
        convertView = LayoutInflater.from(context).inflate(R.layout.review_row, parent, false)
        user = convertView.findViewById(R.id.userName)
        rating = convertView.findViewById(R.id.rating)
        review = convertView.findViewById(R.id.review)

        user.text = arrayList[position].user
        rating.text = arrayList[position].rating
        review.text = arrayList[position].review
        return convertView
    }
}