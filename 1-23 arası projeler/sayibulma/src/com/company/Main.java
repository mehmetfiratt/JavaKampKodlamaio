package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, -1, 32, 78, 5, 10};
        int toFind = 5;
        boolean hasNumber = false;

        for (int number : numbers) {
            if (number == toFind) {
                hasNumber = true;
                break;
            }
        }
        System.out.println(hasNumber);
    }
}
