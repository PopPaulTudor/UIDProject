package com.example.uidproject.join_route.screens

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.widget.EditText
import com.example.uidproject.BaseActivity
import com.example.uidproject.R

class RouteSummary : BaseActivity()  {
    var alertDialog: AlertDialog? = null

    override fun getLayoutId(): Int {
        return R.layout.activity_route_summary
    }

    override fun getBottomNavigationMenuItemId(): Int {
        return R.id.action_home
    }

    fun goToProfile(view: android.view.View) {
        val intent = Intent(this, OthersProfile::class.java)
        startActivity(intent)
    }

    fun joinRoute(view: android.view.View) {
        if (findViewById<EditText>(R.id.starting_point).text.toString().isEmpty() ||
            findViewById<EditText>(R.id.intersection_point).text.toString().isEmpty() ||
            findViewById<EditText>(R.id.destination).text.toString().isEmpty()) {

                val alertDialogBuilder = AlertDialog.Builder(this)
                alertDialogBuilder.setTitle("Please fill in all fields!")
                alertDialogBuilder.setPositiveButton("Ok") { _: DialogInterface, _: Int -> }
                alertDialog = alertDialogBuilder.create()
                alertDialog?.show()

                return
        }

        val intent = Intent(this, JoinedRoute::class.java)
        startActivity(intent)
    }
}