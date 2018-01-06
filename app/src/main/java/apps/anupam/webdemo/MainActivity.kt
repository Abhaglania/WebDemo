package apps.anupam.webdemo

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.KeyEvent
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    var host = "http://192.168.1.148";
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById<WebView>(R.id.webView)

        val webAppInterface = WebAppInterface(this)
        webView.addJavascriptInterface(webAppInterface, "Android")

        webView.webViewClient = MyWebViewClient(this);

        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true


        webView.loadUrl(MyConstants.url)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {

        // Check if the key event was the Back button and if there's history
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event)
    }
}
