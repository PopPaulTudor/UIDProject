package com.example.uidproject.join_route.screens

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import com.example.uidproject.BaseActivity
import com.example.uidproject.R

class OthersProfile : BaseActivity()  {
    var alertDialog: AlertDialog? = null

    override fun getLayoutId(): Int {
        return R.layout.activity_profile
    }

    override fun getBottomNavigationMenuItemId(): Int {
        return R.id.action_home
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