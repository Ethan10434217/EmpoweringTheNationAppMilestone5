package com.example.empaworingnationapp

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SixWeeksScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_weeks_screen)

        // Find the Back button by its ID
        val backButton: Button = findViewById(R.id.backButton)

// Set an OnClickListener for the Back button
        backButton.setOnClickListener {
            // Navigate back to the previous activity or screen
            finish()
        }

        // Find the ImageView by its ID
        val imageView10: ImageView = findViewById(R.id.imageView10)

        // Set an OnClickListener to navigate to the HomeScreen activity
        imageView10.setOnClickListener {
            // Create an Intent to start the HomeScreen activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        // Find the ImageView by its ID
        val imageView13: ImageView = findViewById(R.id.imageView13)

        // Set an OnClickListener to navigate to the AboutScreen activity
        imageView13.setOnClickListener {
            // Create an Intent to start the AboutScreen activity
            val intent = Intent(this, AboutScreen::class.java)
            startActivity(intent)
        }

        val imageViewSIChildmining: ImageView = findViewById(R.id.imageViewSIChildmining)

        // Set an OnClickListener to navigate to SewingCourseScreen
        imageViewSIChildmining.setOnClickListener {
            val intent = Intent(this, ChildminingCourseScreen::class.java)
            startActivity(intent)
        }

        val imageViewSIGarden: ImageView = findViewById(R.id.imageViewSIGarden)

        // Set an OnClickListener to navigate to SewingCourseScreen
        imageViewSIGarden.setOnClickListener {
            val intent = Intent(this, GardenCourseScreen::class.java)
            startActivity(intent)
        }
        val imageViewSICooking: ImageView = findViewById(R.id.imageViewSICooking)

        // Set an OnClickListener to navigate to SewingCourseScreen
        imageViewSICooking.setOnClickListener {
            val intent = Intent(this, CookingCourseScreen::class.java)
            startActivity(intent)
        }
        // Find the ImageView by its ID
        val imageView11: ImageView = findViewById(R.id.imageView11)

        // Set an OnClickListener to navigate to the ServiceScreen activity
        imageView11.setOnClickListener {
            // Create an Intent to start the CalculateFeesActivity
            val intent = Intent(this, CalculateFeesActivity::class.java)
            startActivity(intent)
        }
        // Find the ImageView by its ID
        val imageView6Months: ImageView = findViewById(R.id.imageView6Months)

        // Set an OnClickListener to navigate to the SixMonthsScreen activity
        imageView6Months.setOnClickListener {
            // Create an Intent to start the SixMonthsScreen activity
            val intent = Intent(this, SixMonthsScreen::class.java)
            startActivity(intent)
        }
        // Find the ImageView by its ID
        val imageView6Weeks: ImageView = findViewById(R.id.imageView6Weeks)

        // Set an OnClickListener to navigate to the SixWeeksScreen activity
        imageView6Weeks.setOnClickListener {
            // Create an Intent to start the SixWeeksScreen activity
            val intent = Intent(this, SixWeeksScreen::class.java)
            startActivity(intent)
        }


    }


}
