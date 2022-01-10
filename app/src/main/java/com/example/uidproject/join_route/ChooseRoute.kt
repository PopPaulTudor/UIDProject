package com.example.uidproject.join_route

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.uidproject.BaseActivity
import com.example.uidproject.R
import java.util.ArrayList

class ChooseRoute : BaseActivity() {
    lateinit var listView: ListView
    var adapter: RouteListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_route)

        displayList()
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_choose_route
    }

    override fun getBottomNavigationMenuItemId(): Int {
        return R.id.action_home
    }

    fun displayList(){
        listView = findViewById(R.id.route_list)

        val routes = mutableListOf<Route>()

        routes.add(Route("John", "5km", "87%"))
        routes.add(Route("Rita", "3km", "73%"))
        routes.add(Route("Bob", "6km", "42%"))

        adapter = RouteListAdapter(this, routes as ArrayList<Route>)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = routes[position]

            val intent = Intent(this, RouteSummary::class.java)
            startActivity(intent)
        }
    }
}