package com.xiaoeryu.xposedhook01;

public class Student {
    String name = null;
    String id = null;
    int age = 0;
    public Student(){
        name = "default";
        id = "default";
        age = 10;
    }
    public Student(String name){
        this.name = name;
        id = "default";
    }
    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }
    public Student(String name, String id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
}
