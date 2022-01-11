package com.example.uidproject.join_route.screens

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import com.example.uidproject.BaseActivity
import com.example.uidproject.R
import com.example.uidproject.join_route.adapters.BuddyListAdapter
import com.example.uidproject.join_route.models.Buddy
import java.util.ArrayList

class TheirBuddies : BaseActivity() {
    lateinit var listView: ListView
    var adapter: BuddyListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_their_buddies)

        displayList()
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_their_buddies
    }

    override fun getBottomNavigationMenuItemId(): Int {
        return R.id.action_home
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

            val intent = Intent(this, OthersProfile::class.java)
            startActivity(intent)
        }
    }
}