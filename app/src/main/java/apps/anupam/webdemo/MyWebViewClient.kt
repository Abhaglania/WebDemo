package apps.anupam.webdemo

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v4.content.ContextCompat.startActivity
import android.webkit.WebView
import android.webkit.WebViewClient

class MyWebViewClient constructor(context: Context) : WebViewClient() {
    val mContext = context;
    override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {

        if (Uri.parse(url).host.equals(MyConstants.host)) {
            return false;
        }
        var intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(mContext, intent, null);
        return true;
    }
}