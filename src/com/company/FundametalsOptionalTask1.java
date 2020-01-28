package com.company;

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

        // Filling array with numbers
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        // Searching for the longest number
        for (int i =0; i < arr.length; i++){
            if (arr[i].toString().length() > max) {
                max = arr[i].toString().length();
                maxVal = arr[i];
            }
        }

        // Searching for the shortest number
        for (int i =0; i < arr.length; i++){
            if (arr[i].toString().length() <= min) {
                min = arr[i].toString().length();
                minVal = arr[i];
            }
        }

        // Printing information according the task
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

        // Filling array with numbers
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        // Sorting array from shortest to longest number
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length-1; j++){
                if (arr[j].toString().length() > arr[j+1].toString().length()){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // Printing numbers according the task
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    // 3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
    public static void OptionalTask3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of comparable numbers: ");
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];

        // Filling array with numbers
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        // Calculate the length of entered numbers
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i].toString().length();
        }

        // Calculate the average value of entered numbers
        int average = sum / n;
        System.out.println("Average length of entered numbers is: " + average);

        // Compare and prints numbers according the task
        for (int i = 0; i < arr.length; i++){
            if(arr[i].toString().length() > average) System.out.println("Number " + arr[i] +
                    " is longer then average length of entered numbers.");
        }

    }

    // 4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
    public static void OptionalTask4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of comparable numbers: ");
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];

        // Filling array with numbers
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }


    }

}
