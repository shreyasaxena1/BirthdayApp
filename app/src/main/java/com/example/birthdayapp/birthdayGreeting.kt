package com.example.birthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import kotlinx.android.synthetic.main.activity_birthday_greeting.view.*

class birthdayGreeting : AppCompatActivity() {
    companion object{ //like static object , name extra value is same in every activity
          const val name_extra = "name";
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val name = intent.getSerializableExtra(name_extra) // getting name of key
        birthdayNamevalue.text = "Happy Birthday\n $name!"
    }
}