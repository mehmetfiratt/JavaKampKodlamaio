package com;

public class Main {

    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        krediUI.hesapla(new TarimKrediManager());
        krediUI.hesapla(new OgretmenKrediManger());
    }
}
