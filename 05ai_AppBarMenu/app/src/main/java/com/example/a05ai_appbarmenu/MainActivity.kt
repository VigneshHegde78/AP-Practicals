package com.example.a05ai_appbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mymenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id = item.itemId

        if (id == R.id.search)
            Toast.makeText(this, "Search", Toast.LENGTH_LONG).show()
        if (id == R.id.aboutus)
            Toast.makeText(this, "About Us", Toast.LENGTH_LONG).show()
        if (id == R.id.contactus)
            Toast.makeText(this, "Contact Us", Toast.LENGTH_LONG).show()

        return super.onOptionsItemSelected(item)
    }
}

