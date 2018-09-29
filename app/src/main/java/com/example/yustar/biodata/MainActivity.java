package com.example.yustar.biodata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openTelpon(View v){
        Intent it = new Intent(Intent.ACTION_DIAL);
        startActivity(it);
    }
    public  void openAlamat(View view){
        Uri webpage = (Uri.parse("https://www.google.com/maps/place/Perum+Koveri/@-6.9970396,110.3297399,17z/data=!3m1!4b1!4m5!3m4!1s0x2e708aa072265221:0xc27bcf2360464dc7!8m2!3d-6.9970449!4d110.3319339"));
        Intent it = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(it);
    }
    public void openEmail(View view){
        Intent it = new Intent(Intent.ACTION_SEND);
        it.setData(Uri.parse("mailto: "));
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_EMAIL, new String[]{"Recipent"});
        it.putExtra(Intent.EXTRA_SUBJECT, "Recipent");
        it.putExtra(Intent.EXTRA_TEXT, "Recipent");
        startActivity(it);
    }
}
