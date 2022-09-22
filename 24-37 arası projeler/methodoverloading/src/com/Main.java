package com;

public class Main {
        /*
        Overloading => bir metodun farklı paramtre sayıları veya farklı tipde paramtre
        sayılarıyla tekrar yazılmasır.
         */
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int topla = dortIslem.topla(1, 2);
        int topla1 = dortIslem.topla(1, 2, 3);
    }
}
