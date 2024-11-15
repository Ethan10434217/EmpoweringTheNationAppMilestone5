package com.example.empaworingnationapp

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class GardenCourseScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_garden_screen)

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
        // Find the ImageView by its ID
        val imageView11: ImageView = findViewById(R.id.imageView11)

        // Inside your Activity's onCreate method
        val imageViewShare: ImageView = findViewById(R.id.imageViewShare)
        imageViewShare.setOnClickListener {
            // Create an intent to share
            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Check out this content!")
                type = "text/plain"
            }

            // Start the share intent with a chooser
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }
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
        val imageView_Childminding: ImageView = findViewById(R.id.imageView_Childminding)

        // Set an OnClickListener to navigate to the SixMonthsScreen activity
        imageView_Childminding.setOnClickListener {
            // Create an Intent to start the SixMonthsScreen activity
            val intent = Intent(this, ChildminingCourseScreen::class.java)
            startActivity(intent)
        }
        val imageView_Cooking: ImageView = findViewById(R.id.imageView_Cooking)

        // Set an OnClickListener to navigate to the SixMonthsScreen activity
        imageView_Cooking.setOnClickListener {
            // Create an Intent to start the SixMonthsScreen activity
            val intent = Intent(this, CookingCourseScreen::class.java)
            startActivity(intent)
        }



    }
}