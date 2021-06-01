package org.example;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange\n" + "Banana\n" + "Apple\n");

    }

    private static void checkSumSign() {
        int a = 10;
        int b = 15;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная\n");
        } else {
            System.out.println("Сумма отрицательная\n");
        }

    }

    private static void printColor() {
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
        int a = 10;
        int b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }
}