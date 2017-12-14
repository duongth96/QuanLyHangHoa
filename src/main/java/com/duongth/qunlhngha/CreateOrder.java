package com.duongth.qunlhngha;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;

/**
 * Created by duongth on 14-Dec-17.
 */

public class CreateOrder extends AppCompatActivity {

    Button btnExpOrder, btnAddNewItem;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_order);
        getViewId();
        getSupportActionBar().setTitle("Sản phẩm");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    void getViewId(){

        btnAddNewItem = (Button) findViewById(R.id.btnAddNewItem);
        btnExpOrder = (Button) findViewById(R.id.btnExpOrder);

    }
}
