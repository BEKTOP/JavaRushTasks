package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
    }

    public static void closeToTen(int a, int b) {
        int ca=abs(10-a);
        int cb=abs(10-b);
        if (ca>=cb) System.out.println(b);
        if (ca<cb) System.out.println(a);

        //::CODE:

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}