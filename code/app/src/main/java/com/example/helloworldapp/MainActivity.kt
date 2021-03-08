package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var button : Button
    lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)
        setView()
        setListener()
    }

    fun setView(){
        textView.visibility = View.INVISIBLE
    }

    fun setListener(){
        button.setOnClickListener{
            if (textView.visibility == View.INVISIBLE) {
                textView.visibility = View.VISIBLE
                button.text = getString(R.string.btn_hide)
            }
            else{
                textView.visibility = View.INVISIBLE
                button.text =  getString(R.string.btn_show)
            }
        }
    }
}
