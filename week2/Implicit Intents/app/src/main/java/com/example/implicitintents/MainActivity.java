package com.example.implicitintents;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mWebsiteEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebsiteEditText = findViewById(R.id.website_edittext);
        Uri webpage = Uri.parse(url);
    }

    public void openWebsite(View view) {
    }

    public void openLocation(View view) {
    }

    public void shareText(View view) {
    }
}
