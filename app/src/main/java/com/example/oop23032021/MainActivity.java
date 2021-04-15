package com.example.oop23032021;

import androidx.appcompat.app.AppCompatActivity;

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


//        Log.d("BBB",meo.name);
//
        Cat meo = new Cat("mimi" , "Xám");
        meo.setName("Milu");
//        Log.d("BBB",meo.getName());

        // Tính bao đóng
        // Tính kế thừa
        // Tính đa hình
        // Tính trừu tượng
    // overload : phương thức nạp chồng
//        1 : Các phương thức nạp chồng cùng nằm trên 1 vị trí
//        2 : Các phương thức nạp chồng phải khác với nhau về tham số truyền vào
        printMessage("Xin Chào");
        printMessage(android.R.id.message);
    }
    private void printMessage(String message){
        Log.d("BBB",message);
    }
    private void printMessage(Integer resId){
        Log.d("BBB",String.valueOf(resId));
    }

}