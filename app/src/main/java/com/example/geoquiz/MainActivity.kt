package com.example.geoquiz

import android.content.res.Configuration
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.*
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {

    var dialogDisplay = false
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        dialogDisplay = true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        com.example.geoquiz.Map.createMap()

        val scrollView = findViewById<ScrollView>(R.id.scroll)
        val horizontalScrollView = findViewById<HorizontalScrollView>(R.id.hScroll)

        scrollView.post { scrollView.smoothScrollTo(0 , 400) }
        horizontalScrollView.post { horizontalScrollView.smoothScrollTo(1200 , 0) }

        val imgView = findViewById<ImageView>(R.id.imgView)
        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.map_coloured)
        val colorExtractionTouchListener = ColorTouchListener(bitmap, context = this)
        imgView.setOnTouchListener(colorExtractionTouchListener)
        if (!dialogDisplay)
            showCountryChoiceDialog()
    }

    private fun showCountryChoiceDialog() {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.starting_country_choice, null)
        val dialogBuilder = AlertDialog.Builder(this)
            .setView(dialogView)
            .setTitle("Choose the Starting Country")
            .setCancelable(false)

        val alertDialog = dialogBuilder.create()
        alertDialog.show()

        val startButton = dialogView.findViewById<Button>(R.id.startButton)
        val countryAutoCompleteTextView = dialogView.findViewById<AutoCompleteTextView>(R.id.countryAutoCompleteTextView)


        val countryList = ArrayList(com.example.geoquiz.Map.countryList.keys) // List of country names
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, countryList)
        countryAutoCompleteTextView.setAdapter(adapter)

        startButton.setOnClickListener {
            val selectedCountry = countryAutoCompleteTextView.text.toString().trim()

            if (selectedCountry.isNotEmpty() && com.example.geoquiz.Map.countryList.containsKey(selectedCountry)) {
                // Start the quiz with the selected country
                val countryCode = com.example.geoquiz.Map.countryList[selectedCountry]
                com.example.geoquiz.Map.getCountry(selectedCountry)?.unlocked = true
                alertDialog.dismiss()
            } else {
                // Show an error message if no country is entered or an invalid country is selected
                Toast.makeText(this, "Please enter a valid country name", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
