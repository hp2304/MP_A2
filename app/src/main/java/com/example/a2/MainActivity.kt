package com.example.a2

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var fragementContainer:FrameLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        fragementContainer = findViewById(R.id.fragment_container)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,AddFragment()).commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_recipe ->{
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container,AddFragment()).commit()
            }
            R.id.view_recipe->{

                supportFragmentManager.beginTransaction().replace(R.id.fragment_container,ViewFragment()).commit()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}