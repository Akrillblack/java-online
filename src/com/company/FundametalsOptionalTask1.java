package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FundametalsOptionalTask1 {
    // 1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
    public static void OptionalTask1(){
        int max = 0;
        int min = 1;
        Integer maxVal = 0;
        Integer minVal = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of comparable numbers: ");
        int n = scanner.nextInt();
        Integer[] arr = new Integer [n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for (int i =0; i < arr.length; i++){
            if (arr[i].toString().length() > max) {
                max = arr[i].toString().length();
                maxVal = arr[i];
            }
        }
        for (int i =0; i < arr.length; i++){
            if (arr[i].toString().length() <= min) {
                min = arr[i].toString().length();
                minVal = arr[i];
            }
        }
        System.out.println("The shortest number is: " + minVal + " it contains from " + minVal.toString().length() + " numbers");
        System.out.println("The longest number is: " + maxVal + " it contains from " + maxVal.toString().length() + " numbers");
        scanner.close();
    }
    // 2.     Вывести числа в порядке возрастания (убывания) значений их длины.
    public static void OptionalTask2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of comparable numbers: ");
        int n = scanner.nextInt();
        Integer[] arr = new Integer [n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
            System.out.println(arr[i]);
        }
    }
}
