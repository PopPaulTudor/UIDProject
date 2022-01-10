package com.example.uidproject.join_route

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.uidproject.R

class Profile : AppCompatActivity()  {
    var alertDialog: AlertDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }

    fun seeReviews(view: android.view.View) {
        val intent = Intent(this, Reviews::class.java)
        startActivity(intent)
    }

    fun becomeBuddies(view: android.view.View) {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("Sent Buddy Request")
        alertDialogBuilder.setMessage("Let's hope that they will wanna be your buddy too!")
        alertDialogBuilder.setPositiveButton("Ok") { _: DialogInterface, _: Int -> }
        alertDialog = alertDialogBuilder.create()
        alertDialog?.show()
    }

    fun seeBuddies(view: android.view.View) {
        val intent = Intent(this, TheirBuddies::class.java)
        startActivity(intent)
    }

}