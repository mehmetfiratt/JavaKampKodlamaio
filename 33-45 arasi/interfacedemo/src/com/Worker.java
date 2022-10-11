package com;

public class Worker implements Workable,Eatable{
    @Override
    public void work() {
        System.out.println("Worker work");
    }

    @Override
    public void eat() {
        System.out.println("Worker eat");
    }
}
