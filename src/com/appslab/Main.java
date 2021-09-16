package com.appslab;

public class Main {

    public static void main(String[] args) {

        System.out.println(canCupture("B9","D9"));
        System.out.println(canCupture("A8", "A7"));
        System.out.println(canCupture("B8", "A7"));
    }

     static boolean canCupture(String m, String n){

        if (m.charAt(0) == n.charAt(0)|| m.charAt(1) == n.charAt(1)){
            return true;
        }
        return false;

   }
}

