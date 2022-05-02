package com.company;

import java.util.Scanner;
public class Staff extends Employee {
    String title;
    public Staff(String title){
        this.title = title;

    }
    public Staff(String office, String salary, String dateHired, String title){
        super(office, salary, dateHired);
    }
    public String toString(){
        return title+";";
    }
}
