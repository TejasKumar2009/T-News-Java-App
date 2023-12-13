package com.example.t_news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.util.Objects;

public class NewsActivity extends AppCompatActivity {
    WebView webview;

    @Override
    public void onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        webview = findViewById(R.id.webview);

        Intent intent = getIntent();
        String news_channel_name = intent.getExtras().getString("news_channel_name");


        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setLoadWithOverviewMode(true);
        webview.getSettings().setUseWideViewPort(true);
        webview.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);

                return true;
            }

            @Override
            public void onPageFinished(WebView view, final String url) {
            }
        });

        if (Objects.equals(news_channel_name, "cnn")) {
            webview.loadUrl("https://cnn.com/");
        }
        else if (Objects.equals(news_channel_name, "bbc")) {
            webview.loadUrl("https://bbc.com/");
        }
        else if (Objects.equals(news_channel_name, "abp")) {
            webview.loadUrl("https://www.abplive.com/");
        }
        else if (Objects.equals(news_channel_name, "aajtak")) {
            webview.loadUrl("https://aajtak.in/");

        }
        else if (Objects.equals(news_channel_name, "ndtv")) {
            webview.loadUrl("https://ndtv.com/");
        }
        else if (Objects.equals(news_channel_name, "newsindia18")) {
            webview.loadUrl("https://www.news18.com/");
        }
        else if (Objects.equals(news_channel_name, "zeenews")) {
            webview.loadUrl("https://zeenews.com/");
        }
    }
    }