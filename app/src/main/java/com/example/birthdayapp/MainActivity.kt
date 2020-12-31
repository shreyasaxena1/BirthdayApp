package com.example.birthdayapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createCard(view: View) {
        val name = nameInput.editableText.toString()
        Toast.makeText(this,"Card created for $name",Toast.LENGTH_LONG).show()
//        to move to next screeen
        val intent = Intent(this,birthdayGreeting::class.java)
        intent.putExtra(birthdayGreeting.name_extra,name) //key value pair
        startActivity(intent)

    }
}