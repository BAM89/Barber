package com.bam.q.barbershop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.brad.barbershop.R;

public class AccountActivity extends AppCompatActivity {
    WebView accountWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        accountWebView = (WebView) findViewById(R.id.accountWebView);

    }

    @Override
    protected void onStart() {
        super.onStart();
        accountWebView.loadUrl(getResources().getString(R.string.signupURL));

    }
}