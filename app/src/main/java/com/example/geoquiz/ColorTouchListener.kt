package com.example.geoquiz
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Color
import android.util.Log
import android.view.MotionEvent
import android.view.View
import kotlin.collections.Map

class ColorTouchListener(private val bitmap: Bitmap, private val context: Context,) : View.OnTouchListener {

    private var lastX: Float = 0f
    private var lastY: Float = 0f
    private val touchSlop = 8

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

                val pixel = bitmap.getPixel(x, y)
                val red = Color.red(pixel)
                val green = Color.green(pixel)
                val blue = Color.blue(pixel)

                val colorValue = Color.rgb(red, green, blue)
                val country = com.example.geoquiz.Map.getCountry(colorValue)
                val countryName = country?.name
                if (countryName != null) {
                    Log.d("", "Selected country: $countryName")
                    if (country.unlocked) {
                        val quiz = Quiz(country, context = context)
                        quiz.startQuiz();
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
