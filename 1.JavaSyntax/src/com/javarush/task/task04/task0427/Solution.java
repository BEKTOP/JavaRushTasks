package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String as= reader.readLine();
        int ls = as.length();

        int a = Integer.parseInt(as);
        String l="однозначное", m="", n ="нечетное";
        if (ls==2)l="двузначное";
        if (ls==3)l="трехзначное";

        if(a>0&&a<1000){

            if (a%2==0) n = "четное";
            m = n+" "+l+" число";
            System.out.println(m);
        }
        else{}


        //напишите тут ваш код

    }
}
