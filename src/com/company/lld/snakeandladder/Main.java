package com.company.lld.snakeandladder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Board board = new Board();
    private static List<Player> players= new ArrayList<>();
    public static void main(String[] args) {
        int n=0;

        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int i;
        for(i=0;i<n;i++){
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            board.setSnake(x,y);
        }
        n=sc.nextInt();
        for(i=0;i<n;i++){
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            board.setLadder(x,y);
        }
        int p=sc.nextInt();
        while(p>0){
            String name=sc.next();
            Player player = new Player();
            player.setName(name);
            player.setPosition(0);
            players.add(player);
            p--;
        }
        Game game = new Game();
        game.Start(board,players);
    }
}
