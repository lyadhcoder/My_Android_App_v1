package com.thesourav.com;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView mywebview;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebview = (WebView) findViewById(R.id.webview);
        WebSettings webSettings=mywebview.getSettings();
        mywebview.loadUrl("https://thesourav.com");
        webSettings.setJavaScriptEnabled(true);
        mywebview.setWebViewClient(new WebViewClient());

        actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0078ff")));
        actionBar.setTitle("Welcome to Sourav's Web");
    }
    public class myWebClinet extends WebViewClient{
        @Override
        public void onPageStarted (WebView view, String url, Bitmap favicon){
            super.onPageStarted(view, url, favicon);
        }
        public  boolean shouldOverrideURLLoadin(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
    @Override
    public void onBackPressed(){
        if (mywebview.canGoBack()){
            mywebview.goBack();
        } else {
            super.onBackPressed();
        }
    }

}

