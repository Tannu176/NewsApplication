package com.example.newsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class fullNewsActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_news);
        String url=getIntent().getStringExtra("url");
        webView=findViewById(R.id.web_view);
        WebSettings webSettings=webView.getSettings();
        webSettings.getJavaScriptEnabled();
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);

    }
    public void onBackPressed(){
        if(webView.canGoBack())
            webView.goBack();
        else
            super.onBackPressed();
    }
}