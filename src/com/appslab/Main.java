package com.appslab;

public class Main {

    public static void main(String[] args){
        Numbers(1, 2, 1 );
    }
    static void Numbers(int a, int b, int c){
        if(a == b && a != c || b == c && c != a || a == c && c != b){
            System.out.println(2);
        }
        else if(a != b && a != c && b != c){
            System.out.println(0);
        }
        else if (a == b && a == c){
            System.out.println(3);
        }
}
}
