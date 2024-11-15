package com.example.empaworingnationapp

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SixMonthsScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_months_screen)

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

        // Find the ImageView by ID
        val imageViewSISewing: ImageView = findViewById(R.id.imageViewSISewing)

        // Set an OnClickListener to navigate to SewingCourseScreen
        imageViewSISewing.setOnClickListener {
            val intent = Intent(this, SewingCourseScreen::class.java)
            startActivity(intent)
        }
        val imageViewSILandscaping: ImageView = findViewById(R.id.imageViewSILandscaping)

        // Set an OnClickListener to navigate to SewingCourseScreen
        imageViewSILandscaping.setOnClickListener {
            val intent = Intent(this, LandscapingCourseScreen::class.java)
            startActivity(intent)
        }
        val imageViewSILifeSkills: ImageView = findViewById(R.id.imageViewSILifeSkills)

        // Set an OnClickListener to navigate to SewingCourseScreen
        imageViewSILifeSkills.setOnClickListener {
            val intent = Intent(this, LifeskillsCourseScreen::class.java)
            startActivity(intent)
        }

        val imageViewSIFirstAid: ImageView = findViewById(R.id.imageViewSIFirstAid)

        // Set an OnClickListener to navigate to SewingCourseScreen
        imageViewSIFirstAid.setOnClickListener {
            val intent = Intent(this, FirstaidCourseScreen::class.java)
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
