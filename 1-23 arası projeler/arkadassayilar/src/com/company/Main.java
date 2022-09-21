package com.company;

public class Main {

    public static void main(String[] args) {
        int total1 = 0, total2 = 0, number1 = 220, number2 = 284;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0)
                total1 += i;
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0)
                total2 += i;
        }

        System.out.println((total2 == number1) && (total1 == number2));
    }
}
