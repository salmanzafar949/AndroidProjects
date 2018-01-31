package app.kotlin.com.check_boxes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Check_box(view: View)
    {
        val php    = findViewById<CheckBox>(R.id.p) as CheckBox
        Toast.makeText(this,php.text.toString(),Toast.LENGTH_LONG).show()
    }

    fun Fav_lang(view: View)
    {
        val php    = findViewById<CheckBox>(R.id.p) as CheckBox
        val java   = findViewById<CheckBox>(R.id.j) as CheckBox
        val kotlin = findViewById<CheckBox>(R.id.k) as CheckBox
        val python = findViewById<CheckBox>(R.id.py) as CheckBox

        val res = StringBuffer()
        res.append("Php: ").append(php.isChecked())
        res.append("Java: ").append(java.isChecked())
        res.append("kotlin: ").append(kotlin.isChecked())
        res.append("python: ").append(python.isChecked())

        Toast.makeText(this,res.toString(),Toast.LENGTH_LONG).show()
    }
}
