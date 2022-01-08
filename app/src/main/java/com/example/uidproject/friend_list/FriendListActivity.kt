package com.example.uidproject.friend_list

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.uidproject.R

class FriendListActivity : AppCompatActivity () {
    lateinit var listView: ListView
    var adapter: FriendListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.friend_list)

        displayList()
    }

    fun displayList() {
        listView = findViewById(R.id.friend_list)

        val friends = mutableListOf<Friend>()
        friends.add(Friend("Vlad"))
        friends.add(Friend("Andrei"))
        friends.add(Friend("Roxana"))
        friends.add(Friend("Paul"))
        friends.add(Friend("Tudor"))
        adapter = FriendListAdapter(this, friends as ArrayList<Friend>)
        listView.adapter = adapter

//        listView.setOnItemClickListener {
//            , , position, ->
//            val selectedItem = routes[position]
//            val intent = Intent(this, RouteSummary::class.java)
//            intent.putExtra("creatorName", selectedItem.creatorName)
//            startActivity(intent)
//        }
    }
}