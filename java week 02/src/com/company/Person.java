package com.company;

import java.util.Scanner;
public class Person {
    String name;
    String address;
    String phoneNum;
    String email;
    public Person(){

    }
    public Person(String name, String address, String phoneNum,
                  String email){
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
    }
    public String toString() {
        return name+"; "+address+"; "+phoneNum+"; "+email+";";
    }
}