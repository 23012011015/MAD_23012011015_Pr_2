package com.example.mad_23012011015_pr_2

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    showMessage("on create method")
    }
    fun showMessage(msg:String){
        Log.i(TAG, "showmessage: $msg")
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        showMessage("on restart function call")
        super.onRestart()
    }

    override fun onResume() {
        showMessage("on resume called")
        super.onResume()
    }

    override fun onPause() {
        showMessage("on pause called")
        super.onResume()
    }

    override fun onStop() {
        showMessage("on stop called")
        super.onStop()
    }

}
