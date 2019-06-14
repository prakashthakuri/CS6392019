package com.example.menuproject;

import android.Manifest;
import android.app.ActionBar;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;
import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "Settings is Clicked", Toast.LENGTH_LONG).show();
                return (true);

            case R.id.action_help:
                Intent helpIntent = new Intent(this, HelpActivity.class);
                startActivity(helpIntent);
                return (true);
        }
        return (super.onOptionsItemSelected(item));
    }

    public void sms(View view) {
        String message = "Prakash Shahi Thakuri";
        String number = "9294215472";
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
        smsIntent.setData(Uri.parse("smsto:" + number));
//        smsIntent.setDataAndType(Uri.parse("smsto:" +number), "text"+ message);
//        SmsManager.getDefault().sendTextMessage(number, null, message, null, null);

        smsIntent.putExtra("SMS_BODY", message);
        startActivity(smsIntent);

    }

    public void newActivity(View view) {

        Intent newIntent = new Intent(this, NewActivity.class);
        startActivity(newIntent);
    }

    public void share(View view) {
getSupportActionBar().setTitle("Share the Love");



    }

    public void phone(View view) {
        Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
        phoneIntent.setData(Uri.parse("tel:9294215472"));

        startActivity(phoneIntent);
    }

    public void web(View view) {
        String url = "https://pace.edu";
        Intent i =new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void map(View view) {
        String uri = "https://www.google.com/maps/place/Bhaisepati,+Karyabinayak,+Nepal/@27.648065,85.2959418,15z/data=!3m1!4b1!4m5!3m4!1s0x39eb178514f97739:0xeb1f6e5c822e62ab!8m2!3d27.6493323!4d85.3058664";

        Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(mapIntent);
    }
}
