package com.company;

import java.util.Scanner;
public class Student extends Person {
    String status;
    public Student(String name, String address, String phoneNum,
                   String email, String status) {
        super(name, address, phoneNum, email);
        this.status = status;
    }
    public String toString(){
        return super.toString()+" " + status+";";
    }
}