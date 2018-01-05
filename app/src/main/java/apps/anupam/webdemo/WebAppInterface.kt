package apps.anupam.webdemo

import android.content.Context
import android.webkit.JavascriptInterface
import android.widget.Toast

class WebAppInterface constructor(context: Context) {
    private val mContext = context;

    @JavascriptInterface
    fun showToast(message: String) {
        Toast.makeText(mContext, message, Toast.LENGTH_LONG).show();
    }

}
