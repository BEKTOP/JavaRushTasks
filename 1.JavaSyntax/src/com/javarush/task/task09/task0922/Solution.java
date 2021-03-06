package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat newFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        try {
            Date date = new Date(reader.readLine());
            System.out.println(newFormat.format(date).toUpperCase());
        }
        catch(Exception e){
            System.out.println("Не верный формат"); main(args);
        }
    }
}

