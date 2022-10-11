package com;

public class CustomerManager {
    public BaseDatabaseManager baseDatabaseManager;
    public void add(){
        System.out.println("Müşteri eklendi");
        baseDatabaseManager.get();
    }
}
