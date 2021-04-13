package com.example.oop23032021;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Object , class

        // object đại diện cho 1 thực thể
        // class đại diện cho 1 quần thể

        // Class => Kiểu dữ liệu

        Animal meo = new Animal("Mi mi", "Xám");

        Log.d("BBB",meo.name);

    }
}