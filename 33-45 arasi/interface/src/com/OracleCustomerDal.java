package com;

public class OracleCustomerDal implements CustomerDal{
    @Override
    public void add() {
        System.out.println("Oracle added!");
    }
}
