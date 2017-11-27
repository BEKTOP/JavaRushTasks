package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
while (true){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String st=reader.readLine();
        if (st.equals("exit"))break;
              {

        }
        try {
            if (st.contains(".")){
                print(Double.parseDouble(st));
            } else {
                int num = Integer.parseInt(st);
                if (num > 0 && num < 128) print((short) num);
                else if (num==0) print(num);
                   else print(num);
            }
        }catch (Exception e){
            print(st);
        }
    }}

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
