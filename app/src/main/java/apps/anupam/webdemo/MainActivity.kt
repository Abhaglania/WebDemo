package apps.anupam.webdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView = findViewById<WebView>(R.id.webView);
        val webSettings = webView.settings;
        webSettings.javaScriptEnabled = true;
        val url = "http://192.168.1.148/anupam/demo/";
        webView.loadUrl(url)
    }
}
