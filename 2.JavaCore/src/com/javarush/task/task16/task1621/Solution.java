package com.javarush.task.task16.task1621;

/* 
Thread.currentThread - всегда возвращает текущую нить
*/

import java.security.spec.ECField;

public class Solution {
    static int count = 5;

    public static void main(String[] args) {
        NameOfDifferentThreads tt = new NameOfDifferentThreads();
        tt.start();
        for (int i = 0; i < count; i++) {
            tt.printMsg();
        }
    }

    public static class NameOfDifferentThreads extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }

        public void printMsg() {
            try {
                Thread t = null;//присвой переменной t текущую нить
                t = Thread.currentThread();
                String name = t.getName();
                System.out.println("name=" + name);

                Thread.sleep(1);
                //add sleep here - добавь sleep тут
            } catch (Exception e) {

            }
        }
    }
}