package com.ggstudio.esitii.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ggstudio.esitii.R;

public class ReadMoreActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_more);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(getResources()
                .getDrawable(R.drawable.gradient_background));

        textView = findViewById(R.id.textview_read_more);
        initData();
    }


    public void initData() {
        String str = "e-siiti merupakan suatu sistem berbasis teknologi informasi " +
                "secara elektronik untuk memberikan fasilitas layanan/informasi/panduan " +
                "penggunaan oss kepada masyarakat luas. \n \n" +
                "Adapun tujuan yang ingin dicapapai adalah untuk penyebarluasan informasi " +
                "panduan kepada masyarakat dalam rangka menyokong proses layanan perizinan " +
                "yang mudah, efektif dan efesien sesuai dengan perkembangan ketentuan " +
                "peraturan perundang-undangan dan dalam rangka percepatan peningkatan " +
                "penanaman modal dan berusaha sektor industri";
        textView.setText(str);
    }

}
