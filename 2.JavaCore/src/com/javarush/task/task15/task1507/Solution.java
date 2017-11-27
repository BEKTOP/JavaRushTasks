package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, String value, int n) {
        System.out.println("Заполняем объектами 3");
            }    public static void printMatrix(String m, String value, int n) {
        System.out.println("Заполняем объектами 4");
            }    public static void printMatrix(int m, String value, String n) {
        System.out.println("Заполняем объектами 5");
            }    public static void printMatrix(double m, String value, int n) {
        System.out.println("Заполняем объектами 6");
            }    public static void printMatrix(int m, String value, double n) {
        System.out.println("Заполняем объектами 7");
            }    public static void printMatrix(boolean m, String value, int n) {
        System.out.println("Заполняем объектами 8");
            }    public static void printMatrix(int m, String value, boolean n) {
        System.out.println("Заполняем объектами 9");
            }    public static void printMatrix(int m, boolean value, int n) {
        System.out.println("Заполняем объектами 10");
            }
    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
