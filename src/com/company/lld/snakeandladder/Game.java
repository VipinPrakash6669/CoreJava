package com.company.lld.snakeandladder;

import java.util.List;

public class Game {
    private static Dice dice= new Dice();
    public void Start(Board board, List<Player> players) {
        int n= players.size();
        String str=null;
        int p=0;
        int f=0;
        while(f==0){
            int x=dice.rollDice();
            Player player= players.get(p);

            String chance =player.getName()+" rolled a "+x+" and moved from "+player.getPosition()+" to ";
            player.setPosition(player.getPosition()+x);
            if (player.getPosition()==100){
                System.out.println("Player "+player.getName()+" move from "+x+" "+(player.getPosition()-x)+" to "+ player.getPosition());
                System.out.println(player.getName()+" wins ");
                f=1;
                break;
            } else if(player.getPosition()>100){
                player.setPosition(player.getPosition()-x);
                chance= player.getName()+" can not move from "+player.getPosition()+" to "+(player.getPosition()+x);
            } else{
                while(board.getSnake().containsKey(player.getPosition())){
                    player.setPosition(board.getSnake().get(player.getPosition()));
                }
                while (board.getLadder().containsKey(player.getPosition())){
                    player.setPosition(board.getLadder().get(player.getPosition()));
                }
                chance= chance+player.getPosition();
            }
            System.out.println(chance);
            p++;
            p=p%n;
        }
    }
}
