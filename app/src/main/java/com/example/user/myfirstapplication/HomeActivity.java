package com.example.user.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.user.myfirstapplication.operator.CreatingHotspot;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void watchGameButtonClick(View view) {
        System.out.println("Hi");
    }

    public void operateGameButtonClick(View view) {
        CreatingHotspot.createHotspot(this);
        System.out.println("Bye");
    }
}
