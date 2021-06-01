package com.dicoding.logingoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class DashboardActivity : AppCompatActivity() {

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        mAuth = FirebaseAuth.getInstance()
        val currentUser = mAuth.currentUser

        val id: TextView = findViewById(R.id.id_txt)
        val nama: TextView = findViewById(R.id.id_nama)

        id.text = currentUser?.uid
        nama.text = currentUser?.displayName
    }
}