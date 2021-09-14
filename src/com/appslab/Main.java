package com.appslab;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        System.out.println(multiply(new int[]{1, 2, 3}));

    }
    static List multiply(int[] array){
        int a = 0;
        List b = new ArrayList();
        for(int i = 0; i < array.length; i++){
            a+=1;
        }
        for(int j = 0; j < array.length; j++){
            b.add(array[j]*a);
        }
        return b;
    }

}
