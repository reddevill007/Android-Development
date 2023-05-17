package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.widget.Button;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button firstFregmentBtn, secondFregmentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFregmentBtn = findViewById(R.id.freq1btn);
        secondFregmentBtn = findViewById(R.id.freq2btn);

        firstFregmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new fragment1());
            }
        });

        secondFregmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new fragment2());
            }
        });
    }

    public void replaceFragment(Fragment frag) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout, frag);
        fragmentTransaction.commit();
    }
}