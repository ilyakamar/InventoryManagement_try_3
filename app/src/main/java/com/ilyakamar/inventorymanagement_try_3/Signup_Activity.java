package com.ilyakamar.inventorymanagement_try_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Signup_Activity extends AppCompatActivity {

    ImageView imageView_closeSignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {// onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        initControl();

    }// end onCreate


    private void initControl() {// initControl


        imageView_closeSignup = (ImageView) findViewById(R.id.iv_closeSignup);


        imageView_closeSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Signup_Activity.super.onBackPressed();
            }
        });

    }// end initControl

}// END
