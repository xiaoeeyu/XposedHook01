package com.xiaoeryu.xposedhook01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public void printStudent(Student stu){
        Log.i("Xposed", stu.name + "--" + stu.id + "--" + stu.age);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student aStudent = new Student();
        Student bStudent = new Student("xiaoming");
        Student cStudent = new Student("xiaohua", "2023");
        Student dStudent = new Student("xiaohong", "2023", 20);

        printStudent(aStudent);
        printStudent(bStudent);
        printStudent(cStudent);
        printStudent(dStudent);
    }
}