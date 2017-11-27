package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int m=-1,l=0;
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int max = 1;
        for (int i = 0; i < list.size(); i++)
        {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++)
            {
                if (list.get(i) == list.get(j))
                {
                    count++;
                    if (count > max)
                    {
                        max = count;
                    }
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println(max);
    }
}