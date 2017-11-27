package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args){
    for (int j=1;j<=10;j++) {
        for (int i = 1; i <= 10; i++)
            if (i==10){System.out.print(i*j + "\n");}
            else {
                System.out.print(i * j + "\t");
            }
    }
        //напишите тут ваш код
    }
}
