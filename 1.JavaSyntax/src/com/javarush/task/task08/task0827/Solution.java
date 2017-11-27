package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date d = new Date(date);
        Date first = new Date("JAN 1 "+(1900+d.getYear()));
        long oneDay = 24 * 60 * 60 * 1000;
        long time = (d.getTime() - first.getTime()) / oneDay;
        return (time % 2 == 0)? true : false;
        }
    }