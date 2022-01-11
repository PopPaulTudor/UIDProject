package com.example.uidproject.keep_buddy

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.uidproject.R
import com.example.uidproject.principal_screen.PrincipalScreenActivity

class KeepBuddyActivity : AppCompatActivity() {
    var alertDialog: AlertDialog? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.keep_your_buddy)
    }

    fun showReviewAdded(view: android.view.View) {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("Buddy review added")
        alertDialogBuilder.setMessage("People will take notice of your review!")
        alertDialogBuilder.setPositiveButton("Ok") { _: DialogInterface, _: Int -> }
        alertDialog = alertDialogBuilder.create()
        alertDialog?.show()
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

    }

    fun exitToMain(view: android.view.View) {
        val intent = Intent(applicationContext, PrincipalScreenActivity::class.java)
        this.finish()
        startActivity(intent)

    }
}