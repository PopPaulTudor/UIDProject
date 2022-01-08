package com.example.uidproject.chat

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.uidproject.R

class ChatActivity : AppCompatActivity() {
    lateinit var listView: ListView
    var adapter: ChatListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chat_activity)

        displayList()
    }

    fun displayList() {
        listView = findViewById(R.id.chat_list)

        val chats = mutableListOf<Chat>()
        chats.add(Chat("Vlad" ,"Salut", true));
        chats.add(Chat("Tudor", "Hey", false ));
        chats.add(Chat("Vlad" ,"Ce mai faci?", true));
        chats.add(Chat("Tudor" ,"Bine", false));
        chats.add(Chat("Vlad" ,"Vrei sa iesim la o plimbare", true));
        chats.add(Chat("Tudor" ,"Sigur ca da", false));
        adapter = ChatListAdapter(this, chats as ArrayList<Chat>)
        listView.adapter = adapter

    }
}