package com.example.geoquiz

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Color
import android.util.Log
import android.view.MotionEvent
import android.view.View

/**
 * A touch listener implementation that detects color information from a bitmap when touched.
 * It uses the provided bitmap and context to extract color information and trigger actions based on the color.
 *
 * @param bitmap   The bitmap to extract color information from.
 * @param context  The context used for creating the Quiz instance.
 */
class ColorTouchListener(private val bitmap: Bitmap, private val context: Context) : View.OnTouchListener {

    private var lastX: Float = 0f
    private var lastY: Float = 0f
    private val touchSlop = 8

    /**
     * Handles touch events on the view.
     *
     * @param view   The view that received the touch event.
     * @param event  The MotionEvent object containing information about the touch event.
     * @return True if the touch event is handled, false otherwise.
     */
    override fun onTouch(view: View, event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                lastX = event.x
                lastY = event.y
                return true
            }
            MotionEvent.ACTION_MOVE -> {
                val dx = Math.abs(event.x - lastX)
                val dy = Math.abs(event.y - lastY)

                if (dx > touchSlop || dy > touchSlop) {
                    // Movement detected, do not trigger the color extraction logic
                    return false
                }
                // Continue tracking the touch without triggering any action
                return true
            }
            MotionEvent.ACTION_UP -> {
                val x = event.x.toInt()
                val y = event.y.toInt()

                if (x < 0 || x >= bitmap.width || y < 0 || y >= bitmap.height) {
                    return false
                }

                // Extract RGB components from the pixel at the touched position
                val pixel = bitmap.getPixel(x, y)
                val red = Color.red(pixel)
                val green = Color.green(pixel)
                val blue = Color.blue(pixel)

                val colorValue = Color.rgb(red, green, blue)
                // Get the country based on the color value
                val country = com.example.geoquiz.Map.getCountry(colorValue)
                val countryName = country?.name
                if (countryName != null) {
                    Log.d("", "Selected country: $countryName")
                    if (country.unlocked) {
                        // Create and start a quiz for the selected country
                        val quiz = Quiz(country, context = context)
                        quiz.startQuiz()
                    }
                } else {
                    Log.d("", "No country found for the selected color $colorValue")
                }

                return true
            }
            else -> return false
        }
    }
}
