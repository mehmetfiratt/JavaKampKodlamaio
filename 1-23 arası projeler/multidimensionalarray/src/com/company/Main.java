package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[4][4];

        //System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                array[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }
}
