package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) throws IOException  {
        readKeyFromConsoleAndInitPlanet();
        //System.out.println(thePlanet);
    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут


        public static void readKeyFromConsoleAndInitPlanet() throws IOException {
            try {


                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String planetName = br.readLine();
                switch (planetName) {
                    case Planet.MOON:
                        thePlanet = Moon.getInstance();
                        break;
                    case Planet.SUN:
                        thePlanet = Sun.getInstance();
                        break;
                    case Planet.EARTH:
                        thePlanet = Earth.getInstance();
                        break;
                    default:
                        thePlanet = null;
                        break;
                }
            }catch (Exception e){
                System.out.println(e);

            }
        }
}
