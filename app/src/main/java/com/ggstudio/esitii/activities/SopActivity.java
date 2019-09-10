package com.ggstudio.esitii.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ggstudio.esitii.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class SopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sop);

        PDFView pdfView = findViewById(R.id.pdf_view_sop);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pdfView.fromAsset("PanduanPL-IUI.pdf")
                .defaultPage(0)
                .enableSwipe(true)
                .scrollHandle(new DefaultScrollHandle(this))
                .load();
    }
}
