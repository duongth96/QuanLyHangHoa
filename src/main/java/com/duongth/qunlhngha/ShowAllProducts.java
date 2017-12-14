package com.duongth.qunlhngha;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by duongth on 14-Dec-17.
 */

public class ShowAllProducts extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_all_products);

        getSupportActionBar().setTitle("Tất cả Sản phẩm");
    }
}
