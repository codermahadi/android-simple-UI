package com.codem.mahadi.contactmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    CardView pbook, c_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        pbook = (CardView) findViewById(R.id.pbook);
        pbook.setOnClickListener(this);

        c_test = (CardView) findViewById(R.id.c_test);
        c_test.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.pbook:
                Toast.makeText(this, "Phone book", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(DashboardActivity.this, PhoneBookActivity.class);
                startActivity(intent);
                break;

            case R.id.c_test:
                Toast.makeText(this, "Test book", Toast.LENGTH_LONG).show();
                Intent intent2 = new Intent(DashboardActivity.this, MainActivity.class);
                startActivity(intent2);
                break;

            default:
                Toast.makeText(this, "Wrong", Toast.LENGTH_LONG).show();

        }
    }
}
