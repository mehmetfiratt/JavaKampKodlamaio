package com.company;

public class Main {

    public static void main(String[] args) {
        int sayi1 = 4;
        int sayi2 = 12;
        int sayi3 = 256;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2){
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3)
            enBuyuk = sayi3;

        System.out.println(enBuyuk);
    }
}
