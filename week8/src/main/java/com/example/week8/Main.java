package com.example.week8;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] packageParts = Main.class.getPackage().getName().split("\\.");
        String filePath = packageParts[0] + File.separator + packageParts[1] + File.separator + "Ex2.dat";

        try (FileOutputStream fileOutputStream = new FileOutputStream(new File(filePath), true)) {

            Random random = new Random();

            for (int i = 0; i < 100; i++) {
                int num = random.nextInt(100);
                fileOutputStream.write(num);
            }


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException occurred.");
        }

    }
}
