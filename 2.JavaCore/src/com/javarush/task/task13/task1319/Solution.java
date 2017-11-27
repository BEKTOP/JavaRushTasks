package com.javarush.task.task13.task1319;

import java.io.*;


/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        File myFile = new File(reader.readLine());
        BufferedWriter bw = new BufferedWriter(new FileWriter(myFile));
        PrintWriter writer = new PrintWriter(bw);
        while (true){
            String x = reader.readLine();

            writer.print(x+"\n");
            if (x.equals("exit")) break;
        }
        writer.close();
        reader.close();
        bw.close();

        // напишите тут ваш код
    }
}
