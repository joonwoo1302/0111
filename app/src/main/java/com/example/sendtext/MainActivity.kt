package com.example.sendtext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.activitylifecycle.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sendButton = findViewById<Button>(R.id.sendButton)

        sendButton.setOnClickListener{
            val sendText = findViewById<EditText>(R.id.sendPlaintext)

            val sendMessage = sendText.text.toString()
            val sendIntent = Intent( this, SubActivity::class.java)
            sendIntent.putExtra("message", sendMessage)
            sendIntent.putExtra("test","for debug")
            startActivity(sendIntent)
        }
    }
}