package com.example.flagselector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFlag(View view) {
        ImageView imageView = findViewById(R.id.imageView);
        switch (view.getId()){
            case R.id.FR:
                imageView.setImageResource(R.drawable.fr);
                break;
            case R.id.IT:
                imageView.setImageResource(R.drawable.it);
                break;
            case R.id.SP:
                imageView.setImageResource(R.drawable.sp);
                break;
            case R.id.UK:
                imageView.setImageResource(R.drawable.uk);
                break;
        }
}}


