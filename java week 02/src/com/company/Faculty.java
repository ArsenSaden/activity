package com.company;

import java.util.Scanner;
public class Faculty extends Employee {
    String offHours;
    String rank;
    public Faculty(String offHours, String rank){
        this.offHours = offHours;
        this.rank = rank;

    }
    public Faculty(String office, String salary, String dateHired, String offHours, String rank){
        super(office, salary, dateHired);

    }
    public String toString(){
        return offHours+"; "+rank+";";
    }
}
