package app.kotlin.com.radiobuttons

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Rg_gp(view: View)
    {
           val rg = findViewById<RadioGroup>(R.id.rg_id)
           val id = rg.checkedRadioButtonId
           val rb = findViewById<RadioButton>(id) as RadioButton
        Toast.makeText(this,rb.text.toString(),Toast.LENGTH_LONG).show()

    }
}
