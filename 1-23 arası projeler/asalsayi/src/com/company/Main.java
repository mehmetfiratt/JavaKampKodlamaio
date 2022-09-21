package com.company;

public class Main {

    public static void main(String[] args) {
        int number  = 5;
        boolean isPrime = true;
        if (number < 2)
        {
            isPrime = false;
        }
        else if (number == 2){
            isPrime = true;
        }
        else {
            int condition = number / 2;
            for (int i = 2; i < condition ; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime);
    }
}
