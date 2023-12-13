package com.example.t_news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView cnn, bbc, abp, aajtak, ndtv, newsindia18, zeenews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cnn = findViewById(R.id.cnn);
        bbc = findViewById(R.id.bbc);
        abp = findViewById(R.id.abp);
        aajtak = findViewById(R.id.aajtak);
        ndtv = findViewById(R.id.ndtv);
        newsindia18 = findViewById(R.id.newsindia18);
        zeenews = findViewById(R.id.zeenews);

        cnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewsActivity.class);
                intent.putExtra("news_channel_name", "cnn");
                startActivity(intent);
            }
        });
        bbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewsActivity.class);
                intent.putExtra("news_channel_name", "bbc");
                startActivity(intent);
            }
        });
        abp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewsActivity.class);
                intent.putExtra("news_channel_name", "abp");
                startActivity(intent);
            }
        });
        aajtak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewsActivity.class);
                intent.putExtra("news_channel_name", "aajtak");
                startActivity(intent);
            }
        });
        ndtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewsActivity.class);
                intent.putExtra("news_channel_name", "ndtv");
                startActivity(intent);
            }
        });
        newsindia18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewsActivity.class);
                intent.putExtra("news_channel_name", "newsindia18");
                startActivity(intent);
            }
        });
        zeenews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NewsActivity.class);
                intent.putExtra("news_channel_name", "zeenews");
                startActivity(intent);
            }
        });


    }
}