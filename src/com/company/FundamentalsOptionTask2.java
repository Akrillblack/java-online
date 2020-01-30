package com.company;

import java.util.Random;
import java.util.Scanner;

//    Задание. Ввести с консоли n - размерность матрицы a [n] [n].
//    Задать значения элементов матрицы в интервале значений от -M до M
//    с помощью генератора случайных чисел (класс Random)

public class FundamentalsOptionTask2 {

    public static void fillMatrix() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter matrix size: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the range of random numbers: ");
        int range = scanner.nextInt();

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (random.nextInt(range * 2)) - range;
            }
        }
        for (int[] array : matrix) {
            for (int innerArray : array) {
                System.out.print(innerArray + " ");
            }
            System.out.println();
        }
    }

}


