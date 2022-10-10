package com.managers;

import com.Utilities;
import com.abstracts.CreditManager;
import com.models.Company;
import com.models.Customer;
import com.models.Person;

public class CustomerManager {
    private final Customer customer;
    private final CreditManager creditManager;
    private final String name;
    public CustomerManager(Customer customer, CreditManager creditManager) {
        this.customer = customer;
        name = Utilities.getName(customer);
        this.creditManager = creditManager;
    }

    public void save() {
        System.out.println(name.equals("")  ? "Müşteri Eklendi" : "Müşteri Eklendi :"+name);
    }

    public void delete() {
        System.out.println(name.equals("")  ? "Müşteri Silindi" : "Müşteri Silindi :"+name);
    }
    public void giveCredit(){
        this.creditManager.calculate();
        System.out.println("Kredi Verildi");
    }

}
