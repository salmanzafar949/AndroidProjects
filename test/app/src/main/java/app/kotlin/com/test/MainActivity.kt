package app.kotlin.com.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {

    internal var rg: RadioGroup
    internal var rb: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rg = findViewById<View>(R.id.rg_id)
        val id = rg.checkedRadioButtonId
        rb = findViewById<View>(id)
    }
}
