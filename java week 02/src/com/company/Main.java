package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Student stu = new Student(scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine());
        System.out.println(stu.toString());
        Employee em = new Employee(scan.nextLine(), scan.nextLine(), scan.nextLine());
        System.out.println(em.toString());
        Faculty f = new Faculty(scan.nextLine(), scan.nextLine());
        System.out.println(f.toString());
        Staff s = new Staff(scan.nextLine());
        System.out.println(s.toString());
    }
}