package com.example.hp.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img1;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       img1= findViewById(R.id.img_1);
       btn1  = findViewById(R.id.btn_1);
       img1.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View View) {
               img1.setVisibility(View.VISIBLE);
                img1.setImageResource(R.drawable.img);
            }
        });
    }
}