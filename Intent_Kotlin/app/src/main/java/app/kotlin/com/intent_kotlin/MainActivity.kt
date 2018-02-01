package app.kotlin.com.intent_kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun Start_Activity(view: View)
    {
        val int = Intent("app.kotlin.com.intent_kotlin.Intent_Activity")
        startActivity(int)
    }
}
