package com.example.empaworingnationapp

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.empaworingnationapp.R  // Import your app's R file here

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        // Find the ImageView by ID
        val imageViewSISewing: ImageView = findViewById(R.id.imageViewSISewing)

        // Set an OnClickListener to navigate to SewingCourseScreen
        imageViewSISewing.setOnClickListener {
            val intent = Intent(this, SewingCourseScreen::class.java)
            startActivity(intent)
        }
        // Find the ImageView by its ID
        val imageViewSIChildmining: ImageView = findViewById(R.id.imageViewSIChildmining)

        // Set an OnClickListener to navigate to the ServiceScreen activity
        imageViewSIChildmining.setOnClickListener {
            // Create an Intent to start the ServiceScreen activity
            val intent = Intent(this, ChildminingCourseScreen::class.java)
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

        // Set an OnClickListener to navigate to the CalculateScreen activity
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


