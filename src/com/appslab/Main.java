package com.appslab;

import javafx.print.Collation;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        System.out.println(warOfNumbers(new int[]{1, 2, 3, 4, 5, 6}));
    }
   static int warOfNumbers(int[] array){
    int a = 0;
    int b = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
            a += array[i];
            }
            else{
             b += array[i];
            }
        }
        return a < b? b - a : a - b;
   }
}
