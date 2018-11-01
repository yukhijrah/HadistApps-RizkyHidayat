package com.example.admin.appshadist.fragment.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.admin.appshadist.R;

/**
 * Created by admin on 29/10/2018.
 */

public class DoaDetailFragment extends Fragment {

    private TextView txtNamaDoa;
    private Button btnReadMore;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_doa_detail, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtNamaDoa = (TextView) view.findViewById(R.id.txt_nama_doa);
        btnReadMore = (Button) view.findViewById(R.id.btn_read_more);

        txtNamaDoa.setText(getArguments().getString("nama_doa"));

        onClickReadMore();
    }

    private void onClickReadMore(){
        btnReadMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
