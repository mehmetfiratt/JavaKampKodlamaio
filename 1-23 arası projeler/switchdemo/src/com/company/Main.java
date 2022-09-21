package com.company;

public class Main {

    public static void main(String[] args) {
        char grade = 'A';

        switch (grade){
            case 'A':
                System.out.println("Mükemmel");
                break;
            case 'B':
                System.out.println("Çok Güzel");
                break;
            case 'C':
                System.out.println("İyi");
                break;
            case 'D':
                System.out.println("Fena Değil");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
        }
    }
}
