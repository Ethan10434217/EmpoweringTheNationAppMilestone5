package com.example.empaworingnationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalculateFeesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculatefees_screen)

        // Find the Back button by its ID
        val backButton: Button = findViewById(R.id.backButton)

// Set an OnClickListener for the Back button
        backButton.setOnClickListener {
            // Navigate back to the previous activity or screen
            finish()
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

        // Find the ImageView by its ID
        val imageView10: ImageView = findViewById(R.id.imageView10)

        // Set an OnClickListener to navigate to the HomeScreen activity
        imageView10.setOnClickListener {
            // Create an Intent to start the HomeScreen activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Initialize UI elements with null checks
        val courseCheckBox1 = findViewById<CheckBox>(R.id.courseCheckBox1) ?: return
        val courseCheckBox2 = findViewById<CheckBox>(R.id.courseCheckBox2) ?: return
        val courseCheckBox3 = findViewById<CheckBox>(R.id.courseCheckBox3) ?: return
        val courseCheckBox4 = findViewById<CheckBox>(R.id.courseCheckBox4) ?: return
        val courseCheckBox5 = findViewById<CheckBox>(R.id.courseCheckBox5) ?: return
        val courseCheckBox6 = findViewById<CheckBox>(R.id.courseCheckBox6) ?: return
        val courseCheckBox7 = findViewById<CheckBox>(R.id.courseCheckBox7) ?: return
        val totalFeesText = findViewById<TextView>(R.id.totalFees) ?: return
        val calculateButton = findViewById<Button>(R.id.calculateButton) ?: return

        // Set up calculate button click listener
        calculateButton.setOnClickListener {
            var totalFees = 0
            var selectedCoursesCount = 0

            // Prices of courses
            val prices = listOf(1500, 1500, 1500, 1500, 750, 750, 750)

            // Count selected courses and sum up their prices
            val courses = listOf(courseCheckBox1, courseCheckBox2, courseCheckBox3, courseCheckBox4, courseCheckBox5, courseCheckBox6, courseCheckBox7)
            for ((index, checkBox) in courses.withIndex()) {
                if (checkBox.isChecked) {
                    totalFees += prices[index]
                    selectedCoursesCount++
                }
            }

            // Apply discount based on the number of selected courses
            val discountPercentage = when (selectedCoursesCount) {
                2 -> 0.05  // 5% discount for 2 courses
                3 -> 0.10  // 10% discount for 3 courses
                in 4..7 -> 0.15  // 15% discount for 4 or more courses
                else -> 0.00  // No discount for less than 2 courses
            }

            // Apply the discount
            val discount = totalFees * discountPercentage
            val discountedPrice = totalFees - discount

            // Add VAT (Assuming VAT is 15%)
            val vat = discountedPrice * 0.15
            val finalPrice = discountedPrice + vat

            // Display the total fees including VAT
            totalFeesText.text = "Total: R${"%.2f".format(finalPrice)}"
        }
    }
}

