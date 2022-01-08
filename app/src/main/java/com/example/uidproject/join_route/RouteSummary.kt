package com.example.uidproject.join_route

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.uidproject.R

class RouteSummary : AppCompatActivity()  {
    var alertDialog: AlertDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_route_summary)
    }

    fun goToProfile(view: android.view.View) {
        val intent = Intent(this, Profile::class.java)
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