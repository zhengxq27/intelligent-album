package com.zhengxq27.study.MyFirstTry.model;

public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public User(String name){
        this.name = name;
    }
}
