package com.javarush.task.task14.task1419;

import java.awt.*;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpRetryException;
import java.nio.channels.ReadPendingException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.TooManyListenersException;
import java.util.jar.JarException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) throws IOException {
        initExceptions();
        initException2();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (ArithmeticException e) {
            exceptions.add(e);
        }}

    private static void initException2 () {   //it's first exception
        try {
            InputStream b = new FileInputStream("d:/search.htm");
            int a = b.read();

        } catch (Exception e) {
            exceptions.add(new ArrayIndexOutOfBoundsException());
            exceptions.add(new RuntimeException());
            exceptions.add(new ReflectiveOperationException());
            exceptions.add(new EOFException());
            exceptions.add(new TooManyListenersException());
            exceptions.add(new HeadlessException());
            exceptions.add(new JarException());
            exceptions.add(new RemoteException());
            exceptions.add(new ReadPendingException());
        }
        //напишите тут ваш код

    }
}
