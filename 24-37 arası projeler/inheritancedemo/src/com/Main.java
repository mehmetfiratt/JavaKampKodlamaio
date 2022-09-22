package com;

public class Main {

    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        //krediUI.hesapla(new OgretmenKrediManager());
        BaseKrediManager[] baseKrediManagers = new BaseKrediManager[]
                {new OgretmenKrediManager(), new TarımKrediManager()};
        krediUI.hesapla(baseKrediManagers);

    }
}
