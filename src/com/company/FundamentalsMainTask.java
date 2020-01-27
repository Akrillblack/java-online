package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class FundamentalsMainTask {
    // 1.     Приветствовать любого пользователя при вводе его имени через командную строку.
    public static void MainTask1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        scanner.close();
    }
    // 2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.
    public static void MainTask2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your line: ");
        StringBuffer buffer = new StringBuffer(scanner.nextLine());
        buffer = buffer.reverse();
        System.out.println("Your reversed line is: " + buffer);
        scanner.close();
    }
    // 3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
    public static void MainTask3(){
        final Random RANDOM = new Random();
        int n;
        System.out.println("Enter quantity of random numbers: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] randomArr = new int[n];
        for (int i = 0; i < n; i++){
            randomArr[i] = RANDOM.nextInt();
        }
        System.out.println("----- Print from new line: -----");
        for (int i :randomArr){
           System.out.println(i);
        }
        System.out.println("----- Print through space: -----");
        for (int i :randomArr){
            System.out.print(i + " ");
        }
        scanner.close();
    }
    // 4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
    public static void MainTask4(){
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a: ");
        a = scanner.nextInt();
        System.out.println("Please enter b: ");
        b = scanner.nextInt();
        System.out.println("The amount of a and b is: " + (a + b));
        System.out.println("The product of a and b is: " + (a * b));
        scanner.close();
    }
    // 5.   Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
    // Проверка вынесена в отсутсвующий кейс, для упрощения кода.
    public static void MainTask5(){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number: ");
        number = scanner.nextInt();
        switch (number){
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
            default :
                System.out.println("You have entered a wrong number!");
        }
    }


}
