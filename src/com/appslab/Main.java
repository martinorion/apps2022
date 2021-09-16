package com.appslab;

public class Main {

    public static void main(String[] args) {

        System.out.println(checkEnding("matko", "tko"));
        System.out.println(checkEnding("matko", "sko"));
    }

     static boolean checkEnding(String m, String n){

        return m.endsWith(n);
   }
}

