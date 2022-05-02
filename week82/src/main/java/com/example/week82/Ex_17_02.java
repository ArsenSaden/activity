package com.example.week82;



import java.io.*;

public class Ex_17_02 {
    public static void main(String[] args) {
        try (DataOutputStream di = new DataOutputStream(new FileOutputStream("Ex17_02.txt", true));
        ) {
            for (int i = 0; i < 100; i++) {
                di.writeInt((int)(Math.random() * 10000));
            }
        }
        catch (IOException ex) {
            System.out.println("Exception");
        }
    }
}