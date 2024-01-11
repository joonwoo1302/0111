package com.example.sendtext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.activitylifecycle.R

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val receivedIntent = getIntent()
        val receivedMessage = receivedIntent.getStringExtra("message")

        val receivedDisplaytxt = findViewById<EditText>(R.id.displayReceivedText)
        receivedDisplaytxt.setText(receivedMessage)

        val finishButton = findViewById<Button>(R.id.finishButton)

        finishButton.setOnClickListener{
            finish()
        }


    }
}