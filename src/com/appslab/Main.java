package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println(PieceCake(11, 5, 2));
    }

    static boolean PieceCake(int a, int b, int c) {
        if (b * c <= a) {
            return true;
        }
        return false;
    }

}
