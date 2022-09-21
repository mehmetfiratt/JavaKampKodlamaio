package com.company;

public class Main {

    public static void main(String[] args) {
        double[] myList = {1.2, 2.3, 4.1, 5.5, 10.7};
        double max = myList[0];
        double total = 0.0;
        for (double number : myList) {
            total += number;
            if (max < number)
                max = number;
            System.out.println(number);
        }
        System.out.println("Toplam :" + total);
        System.out.println("En büyük :" + max);
    }
}
