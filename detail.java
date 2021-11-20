package com.example.arraylist_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView tv=findViewById(R.id.textView);
        Intent i=getIntent();
        Log.d("checking", getIntent().getStringExtra("friend Name"));
        tv.setText(getIntent().getStringExtra("friend name"));
    }
}