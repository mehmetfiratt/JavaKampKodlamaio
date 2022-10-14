package com.kodlmaio.nlayerproject.core.logging;

public class EmailLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Email ile loglandı :" + message);
    }
}
