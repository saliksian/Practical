package com.example.practicalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final String Msg1 = "com.example.practicalexam.Key";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView main_tv1 = (TextView) findViewById(R.id.main_tv1);
        TextView main_tv2 = (TextView) findViewById(R.id.main_tv2);

        Button main_btn = (Button) findViewById(R.id.main_btn);

        Random r = new Random();
        int rannum = r.nextInt(5-0)+0;


        String val1 = rannum+"";

        main_tv1.setText(val1);

        String val2 = main_tv2.getText().toString();

        int num1 = Integer.parseInt(val1);
        int num2 = Integer.parseInt(val2);




        main_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = num1+num2;
                String result = res+"";

                Intent first = new Intent(MainActivity.this, second.class);
                first.putExtra(Msg1,result);
                startActivity(first);

            }
        });



    }
}