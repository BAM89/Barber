package com.bam.q.barbershop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.brad.barbershop.R;

public class BookingActivity extends AppCompatActivity {
    WebView bookingWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        bookingWebView =(WebView)findViewById(R.id.bookingWebView);
    }
    @Override
    protected void onStart(){
        super.onStart();
        bookingWebView.loadUrl("https://squareup.com/appointments/book/50WG4CT12JK72/cutzbyq-plano-tx");
    }
}
