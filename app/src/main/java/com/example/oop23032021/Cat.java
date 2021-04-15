package com.example.oop23032021;

import android.util.Log;

public class Cat extends Animal{


    public Cat(String name, String color) {
       // constructor của cha
        // nhờ thằng thằng cha khởi tạo
        super(name, color);
    }


    // Tính đa hình ?
    @Override
    public void setName(String name) {
        super.setName(name);
        Log.d("BBB",name);
    }
}
