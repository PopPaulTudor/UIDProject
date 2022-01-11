package com.example.uidproject.wallet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.uidproject.BaseActivity
import com.example.uidproject.R
import com.example.uidproject.profilePage.ProfilePage

class WalletPage : BaseActivity() {

    lateinit var wallet: ImageView
    lateinit var button: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myWallet = findViewById<TextView>(R.id.my_wallet)
        myWallet.text = "My online wallet"

        wallet = findViewById(R.id.wallet)
        wallet.setImageResource(R.drawable.wallet)

        val myBalance = findViewById<TextView>(R.id.balance)
        myBalance.text = "Current balance: 50$"

        button = findViewById(R.id.back)

        button.setOnClickListener {
            val intent = Intent(this, ProfilePage::class.java)
            this.finish()
            startActivity(intent)
        }
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_wallet_page
    }

    override fun getBottomNavigationMenuItemId(): Int {
        return R.id.action_profile
    }
}