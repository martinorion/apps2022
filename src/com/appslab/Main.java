package com.appslab;

import javafx.print.Collation;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        System.out.println(differenceMaxMin(new int[]{-2, 1, 2, 3, 4, 5, 6}));
    }
   static int differenceMaxMin(int[] array){

        int min = Arrays.stream(array)
               .min()
               .getAsInt();

        int max = Arrays.stream(array)
               .max()
               .getAsInt();

        return min > max? min - max : max - min;

   }
}
