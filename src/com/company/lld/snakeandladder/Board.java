package com.company.lld.snakeandladder;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private Map<Integer,Integer> snake= new HashMap<>();
    private Map<Integer,Integer> ladder= new HashMap<>();

    public Map<Integer, Integer> getSnake() {
        return snake;
    }

    public Map<Integer, Integer> getLadder() {
        return ladder;
    }

    public void setSnake(int x, int y){
        snake.put(x,y);
    }

    public void setLadder(int x,int y){
        ladder.put(x,y);
    }
}
