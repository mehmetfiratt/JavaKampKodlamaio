package com.company;

public class Main {

    public static void main(String[] args) {
        String[] ogrenciler = {"Ali", "Ayşe", "Fatma"};
        String[] ogrenciler2 = new String[3];
        ogrenciler2[0] = "Mehmet";
        ogrenciler2[1] = "Eren";
        ogrenciler2[2] = "Utku";
        for (int i = 0; i < ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("-----------------------");
        for (int i = 0; i < ogrenciler2.length; i++){
            System.out.println(ogrenciler2[i]);
        }
    }
}
