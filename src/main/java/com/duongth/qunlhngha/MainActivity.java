package com.duongth.qunlhngha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCreateOrder, btnShowProduct, btnBuyingOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getIdView();

        btnCreateOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, CreateOrder.class);
                startActivity(in);
            }
        });

        btnShowProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ShowAllProducts.class);
                startActivity(in);
            }
        });

    }


    void getIdView(){
        btnCreateOrder = (Button) findViewById(R.id.btnCreateOrder);
        btnShowProduct = (Button) findViewById(R.id.btnShowProduct);
        btnBuyingOrder = (Button) findViewById(R.id.btnBuyingOrder);
    }
}
