package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
        String num1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        String num2 = bufferedReader.readLine(); //читаем строку с клавиатуры
        System.out.println(name+" получает "+num1+" через "+num2+" лет.");
    }
}
