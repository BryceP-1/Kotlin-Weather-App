package com.example.weatherapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    val CITY: String = "newark,nj"
    val API: String = "91cf4c30606af1b9c756f2bda3"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weatherTask().execute()
    }
    inner class weatherTask() : AsyncTask<String, Void, String>()
    {
        override fun onPreExecute() {
            super.onPreExecute()
            //will disable main contaier and enable progress bar
            findViewById<ProgressBar>(R.id.loader).visibility = View.VISIBLE
            findViewById<RelativeLayout>(R.id.mainContainer).visibility = View.GONE
            findViewById<TextView>(R.id.errorText).visibility = View.GONE
        }
        override fun doInBackground(varang p0: String?): String
        {
            var response:String?
            try{
                response = URL(spec:"https://api.openweathermap.org/data/2.5/weather?")
            }
        }
    }
}
