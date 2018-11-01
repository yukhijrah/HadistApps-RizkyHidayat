package com.example.admin.appshadist;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.admin.appshadist.adapter.DoaAdapter;
import com.example.admin.appshadist.adapter.DoaListener;
import com.example.admin.appshadist.fragment.fragment.DoaDetailFragment;
import com.example.admin.appshadist.model.Doa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 07/10/2018.
 */

public class MainActivity extends AppCompatActivity implements DoaListener {
    private List<Doa> doas = new ArrayList<>();
    private RecyclerView lstDoa;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casting recylclerviewnya
        lstDoa = (RecyclerView) findViewById(R.id.lst_doa);

        LinearLayoutManager linear = new LinearLayoutManager(this);
        lstDoa.setLayoutManager(linear);

        doaCollections();

        DoaAdapter adapter = new DoaAdapter(doas);
        adapter.setListener(this);
        lstDoa.setAdapter(adapter);
    }

    private void replaceFrameDetail(Doa doa){
        FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction ft = fragmentManager.beginTransaction();

        DoaDetailFragment doaFragment = new DoaDetailFragment();

        Bundle kirimDoaBundle = new Bundle();
        kirimDoaBundle.putString("nama_doa", doa.getNama());
        kirimDoaBundle.putString("surah_doa", doa.getSurah());
        kirimDoaBundle.putString("Arti_doa", doa.getArti());

        doaFragment.setArguments(kirimDoaBundle);

        ft.replace(R.id.frm_detail, doaFragment );
        ft.commit();
    }

    private void doaCollections() {
        doas.add(new Doa("Masuk Masjid",
                "arti dari doa masuk masjid",
                "Cari di google"));
        doas.add(new Doa("Masuk Masjid",
                "arti dari doa masuk masjid",
                "Cari di google"));
        doas.add(new Doa("Masuk Masjid",
                "arti dari doa masuk masjid",
                "Cari di google"));
        doas.add(new Doa("Masuk Masjid",
                "arti dari doa masuk masjid",
                "Cari di google"));
        doas.add(new Doa("Masuk Masjid",
                "arti dari doa masuk masjid",
                "Cari di google"));

    }

    @Override
    public void onDoaClick(Doa doa) {
        replaceFrameDetail(doa);
    }
}
