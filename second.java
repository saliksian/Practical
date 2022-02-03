package com.example.practicalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class second extends AppCompatActivity {
    public static final String Msg2 = "com.example.practicalexam.Key1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent get = getIntent();
        String prevSum = get.getStringExtra(MainActivity.Msg1);

        int PreSum = Integer.parseInt(prevSum);

        TextView second_tv1 = (TextView) findViewById(R.id.second_tv1);
        TextView second_tv2 = (TextView) findViewById(R.id.second_tv2);

        Button second_btn = (Button) findViewById(R.id.second_btn);

        Random r = new Random();
        int rannum = r.nextInt(5-0)+0;

        String val2 = rannum+"";
        second_tv2.setText(val2);

        String val1 = second_tv1.getText().toString();

        int num1 = Integer.parseInt(val1);
        int num2 = Integer.parseInt(val2);

//        int res = PreSum+num1+num2;
//        String Result = res+"";

        second_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = PreSum+num1+num2;
                String Result = res+"";

                Intent second = new Intent(second.this, third.class);
                second.putExtra(Msg2,Result);
                startActivity(second);

            }
        });



    }
}