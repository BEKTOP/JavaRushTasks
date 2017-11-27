package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int maximum = -999999999;
        int iLength = Integer.parseInt(reader.readLine());
       // if (iLength<=0){}
        for (int i = 0; i < iLength; i++)
        {
            int tmp = Integer.parseInt(reader.readLine());
            if (maximum<tmp)
            {
                maximum = tmp;
            }
        }
        System.out.println(maximum);
    }
}

