package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        rangeCheck();
        checkForPositivity();
        positivityCheckWithParameters(5);
        printLine(5, "Я строка");
        leapYear(2021);
        arrayWithReplacementValues();
        fillingTheArray();
        multiplyingArrayElementsByTwo();
        sqArray();
        arrayWithParameters(10, 3);
        arrayComp(new int[]{9, 1, 1, 1, 1, 1, 1, 1, 1, 1});
        arrayOffset(new int[]{9, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 2);


    }


    private static void printThreeWords() {
        System.out.println("Задание-1.1");
        System.out.println("Orange\n" + "Banana\n" + "Apple\n");

    }

    private static void checkSumSign() {
        System.out.println("Задание-1.2");
        int a = 10;
        int b = 15;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная\n");
        } else {
            System.out.println("Сумма отрицательная\n");
        }

    }

    private static void printColor() {
        System.out.println("Задание-1.3");
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный\n");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый\n");
        } else {
            System.out.println("Зеленый\n");
        }

    }

    private static void compareNumbers() {
        System.out.println("Задание-1.4");
        int a = 10;
        int b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static void rangeCheck() {
        System.out.println("\nЗадание-2.1");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a + b;

        if (c >= 10 && c <= 20) {
            System.out.println("Сумма лежит в пределах от 10 до 20 (включительно) true");
        } else {
            System.out.println("Сумма не лежит в пределах от 10 до 20 (включительно) false");
        }
    }

    private static void checkForPositivity() {
        System.out.println("\nЗадание-2.2");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    private static void positivityCheckWithParameters(int x) {
        System.out.println("\nЗадание-2.3");
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    private static void printLine(int n, String s) {
        System.out.println("\nЗадание-2.4");
        for (int i = 1; i <= n; i++) {
            System.out.println(s);
        }
    }

    private static void leapYear(int age) {
        System.out.println("\nЗадание-2.5");
        if (age % 4 != 0 || age % 100 == 0 && age % 400 != 0) {
            System.out.println("Год обычный");
        } else {
            System.out.println("Год високосный");
        }
    }

    private static void arrayWithReplacementValues() {
        System.out.println("\nЗадание-2.6");
        int[] zeroOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < zeroOne.length; i++) {
            if (zeroOne[i] == 0) {
                zeroOne[i] = 1;
            } else {
                zeroOne[i] = 0;
            }
        }
        System.out.print(Arrays.toString(zeroOne));
    }

    private static void fillingTheArray() {
        System.out.println("\n\nЗадание-2.7");
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.print(Arrays.toString(array));
    }

    private static void multiplyingArrayElementsByTwo() {
        System.out.println("\n\nЗадание-2.8");
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.print(Arrays.toString(array));
    }

    private static void sqArray() {
        System.out.println("\n\nЗадание-2.9");
        int[][] sqArray = new int[10][10];
        for (int i = 0; i < sqArray.length; i++) {
            for (int j = 0; j < sqArray.length; j++) {
                if (i == j) sqArray[i][j] = 1;
                {
                    System.out.print(sqArray[i][j] + " ");
                }
            }
            System.out.println();
        }
    }


    private static void arrayWithParameters(int len, int initialValue) {
        System.out.println("\n\nЗадание-2.10");
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        System.out.print(Arrays.toString(array));
    }

    public static void arrayComp(int[] array) {
        System.out.println("\n\nЗадание-2.11");
        int sumI = 0;
        for (int i = 0; i < array.length; i++) {
            sumI += array[i];
            int sumJ = 0;
            for (int j = 0; j < array.length; j++) {
                sumJ += (j > i) ? array[j] : 0;
            }
            if (sumI == sumJ) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }

    public static void arrayOffset(int[] array, int n) {
        System.out.println("\n\nЗадание-2.12");
        boolean direction;
        if (n < 0) {
            direction = true;
            n = -n;
        } else {
            direction = false;
        }
        n %= array.length;
        int last = array.length - 1;
        for (int i = 0; i < n; i++) {
            int temp = (direction) ? array[0] : array[last];

            for (int j = 0; j < last; j++) {
                if (direction)
                    array[j] = array[j + 1];
                else
                    array[last - j] = array[last - j - 1];
            }
            if (direction)
                array[last] = temp;
            else
                array[0] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}