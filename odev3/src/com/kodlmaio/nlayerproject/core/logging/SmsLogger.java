package com.kodlmaio.nlayerproject.core.logging;

public class SmsLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Sms ile loglandı :" + message);
    }
}
