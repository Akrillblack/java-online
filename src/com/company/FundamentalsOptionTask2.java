package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//    Задание. Ввести с консоли n - размерность матрицы a [n] [n].
//    Задать значения элементов матрицы в интервале значений от -M до M
//    с помощью генератора случайных чисел (класс Random)
// 2. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.


public class FundamentalsOptionTask2 {

    public static void fillMatrix() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter matrix size: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the range of random numbers: ");
        int range = scanner.nextInt(); // range of numbers for filling matrix

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (random.nextInt((range * 2) + 1)) - range; // filling matrix with random according range
            }
        }
        for (int[] array : matrix) {
            for (int innerArray : array) {
                System.out.printf("%5d", innerArray); // printing our matrix rows
            }
            System.out.println(); // printing from new line matrix rows
        }
        scanner.close();

        // converting matrix to one row array
        int k = 0;
        int [] increased = new int[n * n];
        for (int[] temp : matrix){
            for (int tempInTemp : temp){
                increased[k++] = tempInTemp;
            }
        }

        // counting maximum length of increasing numbers in a row
        int count = 0; // max increasing elements in a row count
        int max = 0; // max count
        int position = 0; // position number for array system out
        for (int y = 0; y < increased.length - 1; y++){
            if (increased[y] < increased[y +1]){ // compare two numbers in a row
                count++;
                if (count > position) {
                    max = count; // saving max count of increasing numbers
                    position = y + 1; // saving last increasing number position
                }
            }else {
                count = 0; // increasing is lost
            }
        }
        int[] forSout = new int[max + 1];
        System.arraycopy(increased, (position - max), forSout, 0, (max + 1)); // copying increasing numbers to array
        System.out.println("Max increasing line is: " + (max + 1));
        System.out.println("Increasing line is: " + Arrays.toString(forSout) + " ");
    }

}

