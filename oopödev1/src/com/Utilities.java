package com;

import com.models.Company;
import com.models.Customer;
import com.models.Person;

public class Utilities {
    public static String getName(Customer customer) {
        if (customer instanceof Person) {
            return ((Person) customer).getFirstName();
        } else if (customer instanceof Company) {
            return ((Company) customer).getCompanyName();
        }
        return "";
    }
}
