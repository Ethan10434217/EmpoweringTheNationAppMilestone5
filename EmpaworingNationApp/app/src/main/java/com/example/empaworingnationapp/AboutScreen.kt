package com.example.empaworingnationapp

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast


class AboutScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_screen)

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

        // Find the ImageView by its ID
        val imageView10: ImageView = findViewById(R.id.imageView10)

        // Set an OnClickListener to navigate to the HomeScreen activity
        imageView10.setOnClickListener {
            // Create an Intent to start the HomeScreen activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Find the Back button by its ID
        val backButton: Button = findViewById(R.id.backButton)

        // OnClickListener for the Back button
        backButton.setOnClickListener {
            finish()
        }

        val phoneNumberInput: EditText = findViewById(R.id.phoneNumberInput)
        val emailInput: EditText = findViewById(R.id.emailInput)
        val submitButton: Button = findViewById(R.id.submitButton)
        val locationDropdown: Spinner = findViewById(R.id.locationDropdown)
        val locationImage: ImageView = findViewById(R.id.locationImage) // Add an ImageView for the location images

        // Image resources for locations
        val locationImages = mapOf(
            "Select a location..." to R.drawable.default_image, // Default placeholder image
            "Johannesburg South - Rosettenville" to R.drawable.image_rosettenville,
            "Sandton" to R.drawable.image_sandton,
            "Johannesburg South - Alan Manor" to R.drawable.image_alan_manor
        )

// Populate Spinner with locations
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            locationImages.keys.toList()
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        locationDropdown.adapter = adapter

        // Initially hide the dropdown and image
        locationDropdown.visibility = View.GONE
        locationImage.visibility = View.GONE

        // Form validation on Submit
        submitButton.setOnClickListener {
            val phoneNumber = phoneNumberInput.text.toString()
            val email = emailInput.text.toString()

            // Validate phone number (e.g., 012-345-6789)
            val phoneRegex = Regex("\\d{3}-\\d{3}-\\d{4}")
            if (!phoneRegex.matches(phoneNumber)) {
                Toast.makeText(this, "Invalid phone number format", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Validate email address
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this, "Invalid email address", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Show dropdown and image view if validation passes
            locationDropdown.visibility = View.VISIBLE
            locationImage.visibility = View.VISIBLE
        }

        // Handle location selection and update ImageView
        locationDropdown.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedLocation = locationImages.keys.toList()[position]
                val imageResource = locationImages[selectedLocation] ?: R.drawable.default_image
                locationImage.setImageResource(imageResource)
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Do nothing
            }
        }
    }
}





