package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button: Button = findViewById(R.id.button)
        var textView: TextView = findViewById(R.id.textView)

        setView(textView)
        setListener(textView,button)
    }

    fun setView(textView: TextView) {
        textView.visibility = View.INVISIBLE
    }

    fun setListener(textView: TextView, button: Button){
        button.setOnClickListener{
            if (textView.visibility == View.INVISIBLE) {
                textView.visibility = View.VISIBLE
                button.text = "HIDE"
            }
            else{
                textView.visibility = View.INVISIBLE
                button.text = "SHOW"
            }
        }
    }
}
