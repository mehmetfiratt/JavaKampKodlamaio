package com;

public class CustomerManager {
    private final CustomerDal customerDal;

    public CustomerManager(CustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add(){
        System.out.println("Added!");
        customerDal.add();
    }
}
