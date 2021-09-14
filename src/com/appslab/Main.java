package com.appslab;

public class Main {

    public static void main(String[] args){
        totalDistance(0.2,0.4, 100);
    }

    static void totalDistance(double heightStair, double lengthStair, double total){

        System.out.println((total / heightStair) *(lengthStair + heightStair ));
    }
}
