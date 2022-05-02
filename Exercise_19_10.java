package com.example.exercise_proga;

import java.util.*;

public class Exercise_19_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Integer[] arrayInt = new Integer[5];
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Enter a number: ");
            arrayInt[i] = input.nextInt();
            }
        Double[] arrayDouble = new Double[5];
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.print("Enter a number: ");
            arrayDouble[i] = input.nextDouble();
           }
        String[] arrayString = new String[5];
        for (int i = 0; i < arrayString.length; i++) {
            System.out.print("Enter a string: ");
            arrayString[i] = input.next();
           }

        */
        Integer[] intArray = {(2), (4), (3)};
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(intArray));

        Double[] doubleArray = {(3.4), (1.3), (-22.1)};
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(doubleArray));

        Character[] charArray = {('a'), ('J'), ('r')};
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(charArray));

        String[] stringArray = {"Arman", "Tom", "Timur"};
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(stringArray));

        System.out.println("Maximum Integer object: " + Large_element.max(intList));
        System.out.println("Maximum Double object: " + Large_element.max(doubleList));
        System.out.println("Maximum Character object: " + Large_element.max(charList));
        System.out.println("Maximum String object: " + Large_element.max(stringList));
    }
}