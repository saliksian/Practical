package com.example.practicalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent get = getIntent();
        String prevSum = get.getStringExtra(second.Msg2);

        TextView third_tv1 = (TextView) findViewById(R.id.third_tv1);

        third_tv1.setText(prevSum);
    }
}