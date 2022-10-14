package com.kodlmaio.nlayerproject.core.validator;

public class CourseValidator implements Validator {
    @Override
    public void isEmpty(String value) {
        boolean empty = value.isEmpty();
        if (empty)
            throw new RuntimeException("Boş alan bırakmayın!");
    }

    @Override
    public void lessThan(double value, int condition) {
        if (value < condition)
            throw new RuntimeException("Kurs Fiyatı Geçersiz");
    }
}
