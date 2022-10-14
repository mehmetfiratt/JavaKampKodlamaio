package com.kodlmaio.nlayerproject.entities;

import java.time.LocalDateTime;

public class Course {
    private int id;
    private String name;
    private double price;
    private LocalDateTime dateTime;

    public Course() {
    }

    public Course(int id, String name, double price, LocalDateTime dateTime) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
