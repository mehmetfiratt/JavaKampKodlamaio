package com.managers;

import com.abstracts.CreditManager;

public class MilitaryCreditManager implements CreditManager {
    @Override
    public void save() {
        System.out.println("Asker Kredisi Verildi");
    }

    @Override
    public void calculate() {
        System.out.println("Asker Kredisi Hesaplandı");
    }
}
