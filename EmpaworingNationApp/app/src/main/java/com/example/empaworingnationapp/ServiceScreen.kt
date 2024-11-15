package com.example.empaworingnationapp

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ServiceScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_screen)

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
                val intent = Intent(this, SewingCourseScreen::class.java)
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
                val intent = Intent(this, LifeskillsCourseScreen::class.java)
                startActivity(intent)
                }

            val imageViewSIChildmining: ImageView = findViewById(R.id.imageViewSIChildmining)

            // Set an OnClickListener to navigate to SewingCourseScreen
            imageViewSIChildmining.setOnClickListener {
                val intent = Intent(this, LifeskillsCourseScreen::class.java)
                startActivity(intent)
            }

            val imageViewSIGarden: ImageView = findViewById(R.id.imageViewSIGarden)

            // Set an OnClickListener to navigate to SewingCourseScreen
            imageViewSIGarden.setOnClickListener {
                val intent = Intent(this, LifeskillsCourseScreen::class.java)
                startActivity(intent)
            }
        val imageViewSICooking: ImageView = findViewById(R.id.imageViewSICooking)

        // Set an OnClickListener to navigate to SewingCourseScreen
        imageViewSICooking.setOnClickListener {
            val intent = Intent(this, CookingCourseScreen::class.java)
            startActivity(intent)
        }

        }


    }