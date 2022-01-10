package com.example.uidproject.join_route

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.uidproject.R
import java.util.ArrayList

class TheirBuddies : AppCompatActivity() {
    lateinit var listView: ListView
    var adapter: BuddyListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_their_buddies)

        displayList()
    }

    private fun displayList() {
        listView = findViewById(R.id.their_buddy_list)

        val buddyList = mutableListOf<Buddy>()

        buddyList.add(Buddy("John", "4/5"))
        buddyList.add(Buddy("Rita", "3/5"))
        buddyList.add(Buddy("Bob", "5/5"))
        buddyList.add(Buddy("Inka", "1/5"))

        adapter = BuddyListAdapter(this, buddyList as ArrayList<Buddy>)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = buddyList[position]

            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}