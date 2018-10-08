package com.example.admin.appshadist;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by admin on 07/10/2018.
 */

public class SplashActivity extends AppCompatActivity{

    private static final int TIGA_DETIK = 3000; //Satuannya milisecond

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        countDown();
    }

    private void countDown(){
        Handler handler = new Handler();
        Runnable menunggu = new Runnable() {
            @Override
            public void run() {
                gotoMain();
            }
        };

        handler.postDelayed(menunggu, TIGA_DETIK);
    }

    private void gotoMain(){
        Intent intentMain = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intentMain);
        finish();
    }

}
