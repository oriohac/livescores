package oriohac.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_welcome.*

class welcome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        button.setOnClickListener(){
            hide()
        val myWebView: WebView = webView
        myWebView.webViewClient = WebViewClient()
        myWebView.settings.javaScriptEnabled = true
        myWebView.loadUrl("https://oriohac.000webhostapp.com/")
        }
    }
    fun hide(){
        button.visibility = View.GONE
        webView.visibility = View.VISIBLE
    }
}
