package com.company;

import java.util.Scanner;
public class Employee extends Person {
    String office;
    String salary;
    String dateHired;
    public Employee(){

    }
    public Employee(String office, String salary, String dateHired){
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;

    }
    public Employee(String name, String address, String phoneNum,
                    String email, String office, String salary, String dateHired){
        super(name, address, phoneNum, email);

    }
    public String toString(){
        return office+"; "+salary+"; "+dateHired+";";
    }
}
