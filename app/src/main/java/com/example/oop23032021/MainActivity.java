package com.example.oop23032021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends BaseAcitivity{

    @Override
    int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    void onCreate() {
        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
    }
}