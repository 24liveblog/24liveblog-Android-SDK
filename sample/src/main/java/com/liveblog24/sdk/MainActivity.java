package com.liveblog24.sdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LiveBlog liveBlog = findViewById(R.id.live_blog);
        liveBlog.setEvent("2576104822462763480");
    }
}