package app.kotlin.com.webview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun load_web(view: View)
    {
        val btn = findViewById<Button>(R.id.button2)
        val Browser = findViewById<WebView>(R.id.Wv)
        Toast.makeText(this,"Loading",Toast.LENGTH_LONG).show()
        Browser.settings.loadsImagesAutomatically = true
        Browser.settings.javaScriptEnabled = true
        Browser.scrollBarStyle
        Browser.loadUrl("http://demo.innowi.com:82/")
    }
}
