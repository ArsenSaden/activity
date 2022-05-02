package com.example.week8;

import java.io.*;

public class Exercise_17_01 {
    public static void main(String[] args) {
        try (PrintWriter di = new PrintWriter(new FileOutputStream(new File("Exercise17-01.txt"), true));
        ) {
            for (int i = 0; i < 100; i++) {
                di.print((int)(Math.random() * 100) + " ");
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("No file");
        }
    }
}
