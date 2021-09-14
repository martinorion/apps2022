package com.appslab;

public class Main {

    public static void main(String[] args){
        System.out.println(Triangle(2,5,2));
    }

    static boolean Triangle(int a, int b, int c){
        if(a + b > c && b + c > a && a + c > b) {
            return true;
        }
        return false;
    }
}

