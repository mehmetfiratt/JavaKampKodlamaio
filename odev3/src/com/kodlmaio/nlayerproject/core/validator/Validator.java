package com.kodlmaio.nlayerproject.core.validator;

public interface Validator {
    void isEmpty(String value);
    void lessThan(double value, int condition);
}
