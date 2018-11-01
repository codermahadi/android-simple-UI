package com.codem.mahadi.contactmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    CardView pbook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        pbook = (CardView) findViewById(R.id.pbook);
        pbook.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.pbook:
                Toast.makeText(this, "Phone book", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(DashboardActivity.this, PhoneBookActivity.class);
                startActivity(intent);

            default:
                Toast.makeText(this, "Wrong", Toast.LENGTH_LONG).show();

        }
    }
}
