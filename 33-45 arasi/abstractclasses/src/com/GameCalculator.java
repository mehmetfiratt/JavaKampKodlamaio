package com;

public abstract class GameCalculator {
    public abstract void calculate(int point);
    public void gameOver(){
        System.out.println("Game Over!");
    }
}
