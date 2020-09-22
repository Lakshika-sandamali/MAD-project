package com.example.shopup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonShopNow;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonShopNow = findViewById(R.id.mainbtn);
        buttonShopNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShop();
            }
        });
    }
        public void openShop(){
            Intent intent = new Intent(this,AddItems_2nd_Shops.class);
            startActivity(intent);

    }
}