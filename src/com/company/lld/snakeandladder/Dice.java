package com.company.lld.snakeandladder;

import java.util.Random;

public class Dice {
    public int rollDice(){
        Random random = new Random();
        int  x=Math.abs(random.nextInt());
        return x%6+1;
    }
}
