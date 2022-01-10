package com.example.uidproject.create_route

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.View.*
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uidproject.R


class StopsAdapter(
    context: Context,
    private val stops: ArrayList<Stop>
) :
    RecyclerView.Adapter<StopsAdapter.CustomViewHolder>() {

    private val inflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.element_route, parent, false)

        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bindStop(stop = stops[position])
    }

    override fun getItemCount() = stops.size

    override fun getItemViewType(position: Int): Int {
        return R.layout.element_route

    }

    class CustomViewHolder(v: View) : RecyclerView.ViewHolder(v),
        OnClickListener {

        var view: View = v
        private var stop: Stop? = null


        init {
            v.setOnClickListener(this)
        }

        fun bindStop(stop: Stop) {
            this.stop = stop
            val start: TextView = view.findViewById(R.id.startingPoint)
            val end: TextView = view.findViewById(R.id.destinationPoint)
            start.text = stop.from
            end.text = stop.to

        }

        override fun onClick(p0: View?) {

        }
    }
}
