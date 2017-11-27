package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {

        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        String w= element[2].getClassName();
        String d= element[2].getMethodName();
        System.out.printf("%s: %s: %s\n", w, d, s );


        //напишите тут ваш код
    }
}
