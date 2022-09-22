package com;

public class Main {

    /*
        Fonksiyon ile metodun farkı şudur.
        OOP dünyasında fonksiyonlar metot olarak isimlendirilir.
     */
    public static void main(String[] args) {
        findNumber(11);
    }

    public static void findNumber(int toFind) {
        int[] numbers = {1, -1, 32, 78, 5, 10};

        boolean hasNumber = false;

        for (int number : numbers) {
            if (number == toFind) {
                hasNumber = true;
                break;
            }
        }
        showMessage(hasNumber, toFind);
    }

    public static void showMessage(boolean status, int number) {
        if (status)
            System.out.println("Sayı bulundu :" + number);
        else
            System.out.println("Sayı bulunamdı :" + number);
    }
}
