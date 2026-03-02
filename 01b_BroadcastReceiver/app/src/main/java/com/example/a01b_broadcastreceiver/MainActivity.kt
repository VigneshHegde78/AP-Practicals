package com.example.a01b_broadcastreceiver

import android.content.Context
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val c = applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val nwInfo = c.activeNetworkInfo

        if (nwInfo != null && nwInfo.isConnected) {
            if (nwInfo.type == ConnectivityManager.TYPE_MOBILE)
                Toast.makeText(applicationContext, "Connected to Mobile Data", Toast.LENGTH_LONG).show()
            else if (nwInfo.type == ConnectivityManager.TYPE_WIFI)
                Toast.makeText(applicationContext, "Connected to Wi-Fi", Toast.LENGTH_LONG).show()
        } else
            Toast.makeText(applicationContext, "Offline", Toast.LENGTH_LONG).show()
    }
}