package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        boolean isKey=true;
        while (isKey) {
            key = reader.readLine();

        switch (key) {
            case "user": person = new Person.User();
            doWork(person);
            break;
            case "coder": person = new Person.Coder();
                doWork(person);
                break;
            case "loser": person = new Person.Loser();
                doWork(person);
                break;
            case "proger": person = new Person.Proger();
                doWork(person);
                break;
            default: isKey = false;
        }


/*        while (true){
            key=reader.readLine();
            if (key.equals("user")){
                doWork(new Person.User());
                break;
            }
           else if (key.equals("loser")){
                doWork(new Person.Loser());
                break;
            }
            else if (key.equals("coder")){
                doWork(new Person.Coder());
                break;
            }
            else if (key.equals("proger")){
                doWork(new Person.Proger());
                break;
            }
            else {break;}
    }*/


    }}

    public static void doWork(Person person) {
        if (person instanceof Person.User){
            ((Person.User) person).live();
        }
        if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }
        if (person instanceof Person.Coder){
            ((Person.Coder) person).coding();
        }
        if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
