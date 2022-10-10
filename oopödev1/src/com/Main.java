package com;

import com.managers.CreditCalculator;
import com.managers.CustomerManager;
import com.managers.TeacherCreditManager;
import com.models.Company;
import com.models.Customer;

public class Main {

    public static void main(String[] args) {

//        CreditCalculator creditManager = new CreditCalculator();
//        creditManager.calculate();
//        creditManager.calculate();
//        creditManager.save();

        Customer customer = new Customer();
        customer.setCity("Istanbul");
        customer.setId(1);

        Company company = new Company();
        company.setCity("Ankara");
        company.setId(2);
        company.setCompanyName("Arçelik");
        company.setTaxNumber("12334");
        
        CustomerManager customerManager = new CustomerManager(company,new TeacherCreditManager());
        customerManager.save();
        customerManager.delete();
        customerManager.giveCredit();



    }
}
