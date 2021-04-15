package com.example.oop23032021;

import android.util.Log;

public class Cat extends Animal{


    public Cat(String name, String color) {
       // constructor của cha
        // nhờ thằng thằng cha khởi tạo
        super(name, color);
    }

    // 1 : Phương ghi đè nằm ở hai nơi khác nhau
    // 2 : Phương thức ghi đè chỉ thay đổi logic code còn lại không thay đổi


    @Override
    public void setName(String name) {
        super.setName(name);
        Log.d("BBB",name);
    }
}
