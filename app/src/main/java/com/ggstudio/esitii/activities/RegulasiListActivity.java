package com.ggstudio.esitii.activities;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

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

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(
                mRecyclerView.getContext(), LinearLayout.VERTICAL);
        mRecyclerView.addItemDecoration(dividerItemDecoration);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(getResources()
                .getDrawable(R.drawable.gradient_background));
    }

    public void initData() {


        Regulasi regulasi = new Regulasi("Undang-undang No.23 2014",
                "Tentang Pemerintahan Daerah",
                "UU23thn2014.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("Undang-undang Perindustrian N0.3 2014",
                "Tentang Perindustrian",
                "UU_Perindustrian_No_3_2014.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("PP Republik Indonesia No.24 2018",
                "Tentang Pelayanan Perizinan Terintegrasi Secara Elektronik",
                "PP_No24_2018.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("PP Republik Indonesia No.107 2015",
                "Tentang Izin Usaha Industri",
                "pp_107_2015.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("PERMENPERIN No.64 2016",
                " Tentang Besaran Jumlah Tenaga Kerja dan Nilai Investasi " +
                        "Untuk Klasifikasi Usaha Industri",
                "Permenperin_No_64_2016.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("PERMENPERIN No.15 2019",
                "Tentang Penerbitan Izin usaha Industri dan Izin Perluasan " +
                        "Dalam Kerangka Pelayanan Perizinan " +
                        "Berusaha Terintegrasi Secara Elektronik",
                "PERMENPERIN-15-2019.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("Perda Tabalong No.05 2016",
                "Tentang Pembentukan dan Susunan Perangkat Daerah",
                "PERDA-Tabalong-No-05-Tahun-2016.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("Perbup Tabalong No.49 2016",
                "Tentang Kedudukan, Susunan Organisasi dan Fungsi serta " +
                        "Tata Kerja Dinas Perindustrian " +
                        "dan Perdagangan Kabupaten Tabalong",
                "PERBUP-Tabalong-No-49-Tahun-2016.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("Perbup Tabalong No.67 2019",
                "Tentang Uraian Tugas Pejabat Di Lingkungan Dinas Perindustrian " +
                        "dan Perdagangan Kabupaten Tabalong",
                "PERBUP-Tabalong-No-67-Tahun-2019.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("Perbup Tabalong No.10 2017",
                "Tentang Pelimpahan Kewenangan di Bidang Perizinan dan Non " +
                        "Perizinan Kepada Kepala DPMPTSP Kabupaten Tabalong",
                "PERBUP-Tabalong-No-10-Tahun-2017.pdf");
        regulasis.add(regulasi);

    }
}
