package app.kotlin.com.rating_bar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RatingBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun R_bar(view: View)
    {
        val rb = findViewById<RatingBar>(R.id.ratingBar)
        val rating = rb.rating
        Toast.makeText(this,rating.toString(),Toast.LENGTH_LONG).show()
    }
}
