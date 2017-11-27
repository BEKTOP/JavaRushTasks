package com.javarush.task.task09.task0929;


import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String sourceFileName = reader.readLine();
                InputStream fileInputStream = getInputStream(sourceFileName);

                String destinationFileName = reader.readLine();
                OutputStream fileOutputStream = getOutputStream(destinationFileName);

                byte[] buffer = new byte[fileInputStream.available()];
                fileInputStream.read(buffer, 0, buffer.length);
                fileOutputStream.write(buffer, 0, buffer.length);
                fileInputStream.close();
                fileOutputStream.close();
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует.");
                continue;
            }
        }
    }


    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}