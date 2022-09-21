package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü Bitti");

        i = 11;
        do{
            System.out.println(i);
            i++;
        }
        while (i < 10);
        System.out.println("Do While Döngüsü Bitti");
        /*
                do while döngüsünde while içine yazılan şart yanlış bile
                olsa döngü en az 1 kere çalışır. Bu durum sadece do while için geçerli
                diğer döngülerde böyle bir durum yoktur
         */
    }
}
