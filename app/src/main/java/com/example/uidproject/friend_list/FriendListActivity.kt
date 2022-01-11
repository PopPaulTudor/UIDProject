package com.example.uidproject.friend_list

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.uidproject.BaseActivity
import com.example.uidproject.R
import com.example.uidproject.chat.ChatActivity

class FriendListActivity : BaseActivity () {
    lateinit var listView: ListView
    var adapter: FriendListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        displayList()
    }

    override fun getLayoutId(): Int {
        return R.layout.friend_list
    }

    override fun getBottomNavigationMenuItemId(): Int {
        return R.id.action_profile
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

        listView.setOnItemClickListener {
                _, _, _, _ ->
            val intent = Intent(this, ChatActivity::class.java)
            startActivity(intent)
        }
    }
}