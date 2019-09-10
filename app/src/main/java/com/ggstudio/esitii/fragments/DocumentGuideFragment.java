package com.ggstudio.esitii.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ggstudio.esitii.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DocumentGuideFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DocumentGuideFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public DocumentGuideFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DocumentGuideFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DocumentGuideFragment newInstance(String param1, String param2) {
        DocumentGuideFragment fragment = new DocumentGuideFragment();
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

        View v = inflater.inflate(R.layout.fragment_document_guide, container, false);
        PDFView pdfView = v.findViewById(R.id.pdf_view_sop);

        pdfView.fromAsset("PanduanPL-IUI.pdf")
                .defaultPage(0)
                .enableSwipe(true)
                .scrollHandle(new DefaultScrollHandle(getContext()))
                .load();

        return v;
    }

}
