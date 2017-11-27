package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String frame = reader.readLine();
        InputStream ipsr = new FileInputStream(reader.readLine());
        //InputStreamReader ipsr = new InputStreamReader (new FileInputStream(frame),"Windows-1251");
        try{
            while (ipsr.available()>0){
                System.out.print((char)ipsr.read());
            }
            System.out.println("");
            ipsr.close();
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}