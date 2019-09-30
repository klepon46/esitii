package com.ggstudio.esitii.activities;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ggstudio.esitii.R;
import com.ggstudio.esitii.adapter.RegulasiAdapter;
import com.ggstudio.esitii.model.Regulasi;

import java.util.ArrayList;
import java.util.List;

public class RegulasiListActivity extends AppCompatActivity {

    private List<Regulasi> regulasis = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private RegulasiAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regulasi_list);
        mRecyclerView = findViewById(R.id.regulasi_recycler_view);

        initData();
        mAdapter = new RegulasiAdapter(regulasis);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(getResources()
                .getDrawable(R.drawable.gradient_background));
    }

    public void initData(){
        Regulasi regulasi = new Regulasi("Perbup Tabalong No.10 2017",
                "Pelimpahan Kewenangan di Bidang Perizinan dan Non " +
                        "Perizinan Kepada Kepala DPMPTSP",
                "PERBUP-Tabalong-No-10-Tahun-2017.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("Perbup Tabalong No.49 2016",
                "Kedudukan, SO, Tugas dan Fungsi serta Tata Kerja Dinas Perindustrian " +
                        "dan Perdagangan",
                "PERBUP-Tabalong-No-49-Tahun-2016.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("Perbup Tabalong No.67 2019",
                "Uraian Tugas Pejabat DIlingkungan Dinas Perindustrian dan Perdagangan",
                "PERBUP-Tabalong-No-67-Tahun-2019.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("Perda Tabalong No.05 2016",
                "Pembentukan dan Susunan Perangkat Daerah",
                "PERDA-Tabalong-No-05-Tahun-2016.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("Permenperin 15 2019",
                "Peraturan Pemerintah No.15 2019","PERMENPERIN-15-2019.pdf");
        regulasis.add(regulasi);



    }
}
