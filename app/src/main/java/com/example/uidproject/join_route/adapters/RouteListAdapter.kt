package com.example.uidproject.join_route.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.uidproject.R
import com.example.uidproject.join_route.models.Route

class RouteListAdapter(private val context: Context, private val arrayList: java.util.ArrayList<Route>) : BaseAdapter() {
    private lateinit var creatorName: TextView
    private lateinit var distance: TextView
    private lateinit var overlapPercentage: TextView

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
        convertView = LayoutInflater.from(context).inflate(R.layout.route_row, parent, false)
        creatorName = convertView.findViewById(R.id.creatorName)
        distance = convertView.findViewById(R.id.distance)
        overlapPercentage = convertView.findViewById(R.id.overlapPercentage)

        creatorName.text = arrayList[position].creatorName
        distance.text = arrayList[position].distance
        overlapPercentage.text = arrayList[position].overlapPercentage
        return convertView
    }
}