package app.kotlin.com.alert_dialogue

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun alert_box(view: View)
    {
       val alertDilog = AlertDialog.Builder(this)
        alertDilog.setTitle("About us")
        alertDilog.setMessage("ChecOut By innowi")
                .setCancelable(false)
                .setPositiveButton("yes", DialogInterface.OnClickListener {
                    dialog, which ->
                    finish()
                } )
                .setNegativeButton("No", DialogInterface.OnClickListener {
                    dialog, which ->
                    dialog.cancel()
                })
        alertDilog.show()
    }
}
