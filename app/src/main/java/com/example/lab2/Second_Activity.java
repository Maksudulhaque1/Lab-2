package com.example.lab2;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Second_Activity extends AppCompatActivity {

    TextView receiver_msg;
    String view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);
        receiver_msg = (TextView)findViewById(R.id.show);
        Intent intent = getIntent();
        view = intent.getStringExtra("message_key");
        receiver_msg.setText(view);

    }

    public void Click(View v) {
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, view);
        startActivity(intent);




    }





}