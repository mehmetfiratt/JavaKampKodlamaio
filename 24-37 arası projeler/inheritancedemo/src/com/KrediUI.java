package com;

public class KrediUI {
    public void hesapla(BaseKrediManager baseKrediManager) {
        baseKrediManager.hesapla();
    }

    public void hesapla(BaseKrediManager[] baseKrediManager) {
        for (BaseKrediManager krediManager : baseKrediManager) {
            krediManager.hesapla();
        }
    }
}
