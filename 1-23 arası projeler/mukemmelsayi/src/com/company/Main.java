package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 30;
        int total = 0;
        int i = 1;
        while (i < number){
           if (number % i == 0){
               total += i;
           }
            i++;
        }
        System.out.println(number == total);
    }
}
