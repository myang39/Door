package com.example.door

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        photo_main_activity.setImageResource(R.drawable.ic_icons8_avatar)

        var starOn: Boolean = true
        star_button_main_activity.setOnClickListener {
            if (starOn) { // true
                starOn = false
                star_main_activity.alpha = 0F
            } else { // false
                starOn = true
                star_main_activity.alpha = 1F
            }
        }
    }
}