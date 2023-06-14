package com.example.geoquiz

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.Toast

class CountryChoice(private val context: Context, private val country: Country, private val numQuestions: Int) {

    private lateinit var checkBoxes: List<CheckBox>
    private lateinit var alertDialog: AlertDialog
    var selectedCountries = arrayListOf<String>()

    fun showCountryChoiceDialog() {
        val inflater = LayoutInflater.from(context)
        val dialogView = inflater.inflate(R.layout.country_choice, null)
        checkBoxes = createCheckBoxes(dialogView)
        alertDialog = buildAlertDialog(dialogView)
        alertDialog.show()
    }

    private fun createCheckBoxes(dialogView: View): List<CheckBox> {
        val container: ViewGroup = dialogView.findViewById(R.id.country_choice_container)
        container.removeAllViews()
        val checkBoxes = mutableListOf<CheckBox>()

        for (neighbor in country.getLockedNeighbors()) {
            val checkBox = CheckBox(context)
            checkBox.text = neighbor.name
            checkBoxes.add(checkBox)
            container.addView(checkBox)
        }

        return checkBoxes
    }

    private fun buildAlertDialog(dialogView: View): AlertDialog {
        return AlertDialog.Builder(context)
            .setView(dialogView)
            .setTitle("Choose $numQuestions Countries")
            .setPositiveButton("OK") { _, _ ->
                if (getCountries().size == numQuestions) {
                    for (c in getCountries())
                        com.example.geoquiz.Map.getCountry(c)?.unlocked = true
                } else {
                    Toast.makeText(context, "Please select $numQuestions countries", Toast.LENGTH_SHORT).show()
                    showCountryChoiceDialog() // Redo the country selection
                }
            }
            .create()
    }

    private fun getCountries(): ArrayList<String> {

        for (checkBox in checkBoxes) {
            if (checkBox.isChecked) {
                selectedCountries.add(checkBox.text.toString())
            }
        }
        return selectedCountries
    }
}
