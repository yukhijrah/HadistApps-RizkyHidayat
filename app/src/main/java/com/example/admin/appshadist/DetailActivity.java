package com.example.admin.appshadist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by admin on 07/10/2018.
 */

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toast.makeText(this, getIntent().getStringExtra("nama_doa"), Toast.LENGTH_LONG).show();
    }
}
