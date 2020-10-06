package com.bam.q.barbershop;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.brad.barbershop.R;

public class MainActivity extends AppCompatActivity {
    Button serviceButton;
    Button callButton;
    Button bookingButton;
    Button shareButton;
    Button galleryButton;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        this.serviceButton =(Button)findViewById(R.id.serviceButton);
        this.callButton =(Button)findViewById(R.id.callButton);
        callButton.setVisibility(View.VISIBLE);
        callButton.setBackgroundColor(Color.TRANSPARENT);
        this.bookingButton=(Button)findViewById(R.id.bookingButton);
        this.shareButton=(Button)findViewById(R.id.shareButton);
        this.galleryButton=(Button)findViewById(R.id.galleryButton);

        serviceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ServicesActivity.class));
            }
        });
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:4698554056"));
                startActivity(intent);
            }
        });
        bookingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BookingActivity.class));
            }
        });
        galleryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BarberGallery.class));
            }
        });
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Download the Barber App.");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });
    }

}
