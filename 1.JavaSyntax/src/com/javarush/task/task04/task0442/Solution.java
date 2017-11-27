package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s=0;
        for (int i=0; ; )
        { i = Integer.parseInt(reader.readLine());
            s+=i;

            if (i==-1) break;
        }
        System.out.println(s);




        //напишите тут ваш код
    }
}
