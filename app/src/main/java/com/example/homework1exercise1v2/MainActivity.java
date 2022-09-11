package com.example.homework1exercise1v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        TextView hello = (TextView) findViewById(R.id.tv_1);
        ImageView elephant = (ImageView) findViewById(R.id.img_1);

        if (hello.getText()=="Hello") {
            hello.setText("Goodbye");
            elephant.setVisibility(View.INVISIBLE);
        }
        else {
            hello.setText("Hello");
            elephant.setVisibility(View.VISIBLE);
        }


    }
}