package com.ggstudio.esitii.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.ggstudio.esitii.R;
import com.ggstudio.esitii.adapter.RegulasiAdapter;
import com.ggstudio.esitii.model.Regulasi;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link } interface
 * to handle interaction events.
 * Use the {@link RegulasiIntiFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RegulasiIntiFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private List<Regulasi> regulasis = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private RegulasiAdapter mAdapter;


    public RegulasiIntiFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RegulasiIntiFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RegulasiIntiFragment newInstance(String param1, String param2) {
        RegulasiIntiFragment fragment = new RegulasiIntiFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_regulasi_inti, container, false);
        mRecyclerView = v.findViewById(R.id.regulasi_inti_recycler_view);
        initData();

        mAdapter = new RegulasiAdapter(regulasis);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(
                mRecyclerView.getContext(), LinearLayout.VERTICAL);
        mRecyclerView.addItemDecoration(dividerItemDecoration);

        return v;
    }


    public void initData() {

        Regulasi regulasi = new Regulasi("UU No.3 Tahun 2014",
                "Tentang Perindustrian",
                "UU_Perindustrian_No_3_2014.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("Peraturan Pemerintah No.107 Tahun 2015",
                "Tentang Izin Usaha Industri",
                "pp_107_2015.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("Peraturan Pemerintah No.24 Tahun 2018",
                "Tentang Pelayanan Perizinan Terintegrasi Secara Elektronik",
                "PP_No24_2018.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("PERMENPERIN No. 64/m-IND/PER/7/Tahun 2016",
                " Tentang Besaran Jumlah Tenaga Kerja dan Nilai Investasi " +
                        "Untuk Klasifikasi Usaha Industri",
                "Permenperin_No_64_2016.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("PERMENPERIN No.38 Tahun 2018",
                "Tentang Akun Sistem Informasi Industri Nasional",
                "Permenperin_No.38_Tahun_2018.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("PERMENPERIN No.2 Tahun 2019",
                "Tentang Tata Cara Penyampaian Data Industri, Data Kawasan Industri, " +
                        "Data Lain, Informasi Industri, dan Informasi Lain Melalui " +
                        "Sistem Informasi Industri Nasional",
                "Permenperin_No_2_Tahun_2019.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("PERMENPERIN No.15 Tahun 2019",
                "Tentang Penerbitan Izin usaha Industri dan Izin Perluasan " +
                        "Dalam Kerangka Pelayanan Perizinan " +
                        "Berusaha Terintegrasi Secara Elektronik",
                "PERMENPERIN-15-2019.pdf");
        regulasis.add(regulasi);

    }
}
