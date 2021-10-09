package com.vss3003.filmsearcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_menu.setOnClickListener {
            Toast.makeText(this, "Меню", Toast.LENGTH_SHORT).show()
        }

        button_watch_later.setOnClickListener {
            Toast.makeText(this, "Меню", Toast.LENGTH_SHORT).show()
        }

        button_favorite.setOnClickListener {
            Toast.makeText(this, "Меню", Toast.LENGTH_SHORT).show()
        }

        button_options.setOnClickListener {
            Toast.makeText(this, "Меню", Toast.LENGTH_SHORT).show()
        }

        button_selected.setOnClickListener {
            Toast.makeText(this, "Меню", Toast.LENGTH_SHORT).show()
        }
    }
}