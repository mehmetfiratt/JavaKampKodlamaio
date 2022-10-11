package com;

public class ManGameCalculator extends GameCalculator {
    @Override
    public void calculate(int point) {
        double result = point * 1.9;
        System.out.println("man point :" + result);
    }
}
