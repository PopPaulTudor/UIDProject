package com.example.uidproject.profilePage

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.uidproject.R
import com.example.uidproject.addCar.AddCar
import com.example.uidproject.wallet.WalletPage

class ProfilePage : AppCompatActivity() {

    lateinit var profilePicture: ImageView
    lateinit var ratingStars: ImageView
    lateinit var friendlist: Button
    lateinit var wallet: Button
    lateinit var addCar: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_page)

        profilePicture = findViewById(R.id.profile_image)
        profilePicture.setImageResource(R.drawable.profile_image)

        val firstName = findViewById<TextView>(R.id.firstName)
        firstName.text = "First name: John"

        val lastName = findViewById<TextView>(R.id.lastName)
        lastName.text = "Last name: Doe"

        val age = findViewById<TextView>(R.id.age)
        age.text = "Age: 31"

        val from = findViewById<TextView>(R.id.from)
        from.text = "From: Cluj"

        val ratings = findViewById<TextView>(R.id.rating)
        ratings.text = "Overall rating:"

        val no_ratings = findViewById<TextView>(R.id.no_ratings)
        no_ratings.text = "23 ratings"

       ratingStars = findViewById(R.id.overall_rating)
       ratingStars.setImageResource(R.drawable.rating_stars)

        friendlist = findViewById(R.id.friendlist)
        wallet = findViewById(R.id.wallet)
        addCar = findViewById(R.id.add_car)

        val rate1 = findViewById<TextView>(R.id.rate1)
        rate1.text = "George"

        ratingStars = findViewById(R.id.george_rating)
        ratingStars.setImageResource(R.drawable.rating_stars)

        val rateGeorge = findViewById<TextView>(R.id.rate_george)
        rateGeorge.text = "She was amazing, but she was talking waaay too much. " +
                "Like girl shut your pipe once in a while. Ok?"

        friendlist.setOnClickListener{

        }

        wallet.setOnClickListener {
            val intent = Intent(this, WalletPage::class.java)
            this.finish()
            startActivity(intent)
        }

        addCar.setOnClickListener {
            val intent = Intent(this, AddCar::class.java)
            this.finish()
            startActivity(intent)
        }
    }
}