package com.ilyakamar.inventorymanagement_try_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Login_Activity extends AppCompatActivity {

    ImageView iv_closeLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {// onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        initControl();



    }// end


    private void initControl() {// initControl


        iv_closeLogin = (ImageView) findViewById(R.id.iv_closeLogin);


        iv_closeLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login_Activity.super.onBackPressed();
            }
        });

    }// end initControl


}//  END
