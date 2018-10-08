package com.example.admin.appshadist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.admin.appshadist.model.Doa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 07/10/2018.
 */

public class MainActivity extends AppCompatActivity {
    private List<Doa> doas = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void doaCollections() {
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "Cari di google"));
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "Cari di google"));
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "Cari di google"));
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "Cari di google"));
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "Cari di google"));

    }
}
