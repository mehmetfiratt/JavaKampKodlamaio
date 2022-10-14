package com.kodlmaio.nlayerproject.core.logging;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Veritabanına loglandı! :" + message);
    }
}
