package apps.anupam.webdemo

import android.annotation.TargetApi
import android.content.Context
import android.content.Intent
import android.os.Build
import android.support.v4.content.ContextCompat
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient


class MyWebViewClientAboveLOLLIPOP constructor(context: Context) : WebViewClient() {
    var mContext = context;
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
        if (request != null) {
            if (request.url.host.equals(MyConstants.host)) {
                return false;
            }
        } else {
            return true;
        }
        val intent = Intent(Intent.ACTION_VIEW, request.url)
        ContextCompat.startActivity(mContext, intent, null);
        return true;
    }

}