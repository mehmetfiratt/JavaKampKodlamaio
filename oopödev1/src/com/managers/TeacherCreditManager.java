package com.managers;

import com.abstracts.BaseCreditManager;
import com.abstracts.CreditManager;

public class TeacherCreditManager extends BaseCreditManager implements CreditManager {
    @Override
    public void calculate() {
        System.out.println("Öğretmen Kredisi Hesaplandı");
    }
}
