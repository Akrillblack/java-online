package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FundametalsOptionalTask1 {
    // 1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
    public static void OptionalTask1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of comparable numbers: ");
        int n = scanner.nextInt();
        int[] arr = new int [n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        Integer min = arr[0];
        Integer max = arr[n-1];
        System.out.println("The shortest number is: " + min + " it contains from " + min.toString().length() + " numbers");
        System.out.println("The longest number is: " + max + " it contains from " + max.toString().length() + " numbers");
    }
}
