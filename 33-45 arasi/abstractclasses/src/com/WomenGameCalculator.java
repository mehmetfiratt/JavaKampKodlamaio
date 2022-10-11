package com;

public class WomenGameCalculator extends GameCalculator{
    @Override
    public void calculate(int point) {
        double result = point * 1.2;
        System.out.println("Woman point :"+result);
    }
}
