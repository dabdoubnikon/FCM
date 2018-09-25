package com.icanappz.fcmpush.UI;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toolbar;

import com.icanappz.fcmpush.R;

public class WebviewActivity extends AppCompatActivity {
    public Button mButton , mButton2;
    public WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        mButton = (Button) (findViewById(R.id.button1));
        LL = (LinearLayout) (findViewById(R.id.L));
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wv1.setVisibility(View.VISIBLE);
                mButton2.setVisibility(View.INVISIBLE);
                wv1.getSettings().setLoadsImagesAutomatically(true);
                wv1.getSettings().setJavaScriptEnabled(true);
                wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv1.loadUrl("http://alnassaj-group.com");
                wv1.getSettings().setLoadWithOverviewMode(true);
                wv1.getSettings().setUseWideViewPort(true);
                mButton.setVisibility(View.INVISIBLE);
            }
        });

        mButton2 = (Button) (findViewById(R.id.button2));
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wv1.setVisibility(View.VISIBLE);
                mButton.setVisibility(View.INVISIBLE);
                wv1.getSettings().setLoadsImagesAutomatically(true);
                wv1.getSettings().setJavaScriptEnabled(true);
                wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv1.loadUrl("http://alnassaj-group.com/shop/)");
                mButton2.setVisibility(View.INVISIBLE);
            }
        });

    }


}



