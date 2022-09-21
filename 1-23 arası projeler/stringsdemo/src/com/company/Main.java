package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
       String mesaj = "Bugün hava çok güzel";
//        System.out.println(mesaj);
//        System.out.println("Mesajın Uzunluğu :"+mesaj.length());
//        System.out.println("5. eleman :"+mesaj.charAt(4));
//        System.out.println(mesaj.concat(". Yaşasın"));
//        System.out.println(mesaj.startsWith("a"));
//        System.out.println(mesaj.endsWith("l"));
//        char[] karakterler = new char[5];
//        mesaj.getChars(0,5,karakterler,0);
//        System.out.println(karakterler);
//        System.out.println(mesaj.indexOf("ug"));
//        System.out.println(mesaj.indexOf('e'));
        System.out.println(mesaj.replace(' ',','));
        System.out.println(mesaj.substring(2,7));
        for (String word : mesaj.split(" ")){
            System.out.println(word);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.concat("       ").trim());
    }
}
