package com.ggstudio.esitii.fragments;


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
 * Use the {@link RegulasiSupportFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RegulasiSupportFragment extends Fragment {
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


    public RegulasiSupportFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RegulasiSupportFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RegulasiSupportFragment newInstance(String param1, String param2) {
        RegulasiSupportFragment fragment = new RegulasiSupportFragment();
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
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_regulasi_support, container, false);
        mRecyclerView = v.findViewById(R.id.regulasi_support_recycler_view);
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

        Regulasi regulasi = new Regulasi("UU No.23 Tahun 2014",
                "Tentang Pemerintahan Daerah",
                "UU23thn2014.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("Perda Tabalong No.05 2016",
                "Tentang Pembentukan dan Susunan Perangkat Daerah",
                "PERDA-Tabalong-No-05-Tahun-2016.pdf");
        regulasis.add(regulasi);

        regulasi = new Regulasi("Perbup Tabalong No.49 Tahun 2016",
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

        regulasi = new Regulasi("Perbup Tabalong No.10 Tahun 2017",
                "Tentang Pelimpahan Kewenangan di Bidang Perizinan dan Non " +
                        "Perizinan Kepada Kepala DPMPTSP Kabupaten Tabalong",
                "PERBUP-Tabalong-No-10-Tahun-2017.pdf");
        regulasis.add(regulasi);

    }

}
