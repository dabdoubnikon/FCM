package com.icanappz.fcmpush.UI;

import android.webkit.WebView;
import android.webkit.WebViewClient;

class MyBrowser extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }

}
