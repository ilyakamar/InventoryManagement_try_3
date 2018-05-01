package com.ilyakamar.inventorymanagement_try_3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_SplashScreen extends AppCompatActivity {

    // duration until go to next page
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {// onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__splash_screen);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(Activity_SplashScreen.this,StartScreen_Activity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);



    }// end onCreate
}// END
