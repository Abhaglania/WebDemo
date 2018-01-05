package apps.anupam.webdemo

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
      var host="http://192.168.1.148";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webView)

        val webAppInterface = WebAppInterface(this)
        webView.addJavascriptInterface(webAppInterface, "Android")

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            webView.webViewClient = MyWebViewClientAboveLOLLIPOP(this)
        else
            webView.webViewClient = MyWebViewClient(this);

        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true


        webView.loadUrl(MyConstants.url)
    }
}
