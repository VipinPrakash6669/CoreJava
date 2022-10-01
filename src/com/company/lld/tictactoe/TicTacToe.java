package com.company.lld.tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        String x,o,xp,op;
        Scanner sc = new Scanner(System.in);
        x=sc.next();
        xp=sc.next();
        o=sc.next();
        op=sc.next();
        System.out.println(xp+" chooses "+x);
        System.out.println(op+" chooses "+o);
        char a[][]= initializeGame();
        int p,q,f=9,c=0;
        while(c<9){
            String s=sc.next();
            if(s.equals("exit"))break;
            String s1=sc.next();
            p=(s.charAt(0)-'0')-1;
            q=s1.charAt(0)-'0'-1;
            c=makeMove(p,q,c,a);
            print(a);
            if(checkWin(a)==true){
                if(c%2==1)
                    System.out.println(xp+" wins");
                else
                    System.out.println(op+" wins");
                break;
            }
            if(c==9) System.out.println("Game Over");
        }

        return;
    }

    private static boolean checkWin(char[][] a) {
        if(a[0][0]==a[0][1]&&a[0][1]==a[0][2]&&a[0][0]!='-')return true;
        if(a[1][0]==a[1][1]&&a[1][1]==a[1][2]&&a[1][0]!='-')return true;
        if(a[2][0]==a[2][1]&&a[2][1]==a[2][2]&&a[2][0]!='-')return true;

        if(a[0][0]==a[1][0]&&a[1][0]==a[2][0]&&a[0][0]!='-')return true;
        if(a[0][1]==a[1][1]&&a[1][1]==a[2][1]&&a[0][1]!='-')return true;
        if(a[0][2]==a[1][2]&&a[1][2]==a[2][2]&&a[0][2]!='-')return true;

        if(a[0][0]==a[1][1]&&a[1][1]==a[2][2]&&a[0][0]!='-')return true;
        if(a[0][2]==a[1][1]&&a[1][1]==a[2][0]&&a[0][2]!='-')return true;

        return false;
    }

    private static void print(char[][] a) {
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int makeMove(int p, int q, int c, char[][] a) {
        if(p<0||p>2) {
            System.out.println("Invalid move");
            return c;
        }
        if(q<0||q>2) {
            System.out.println("Invalid move");
            return c;
        }
        if(a[p][q]=='-'){
            if(c%2==0){
                a[p][q]='X';
            }
            else{
                a[p][q]='O';
            }
            c++;
        }else{
            System.out.println("Invalid move");
        }
        return c;
    }

    private static char[][] initializeGame() {
        char a[][] = new char[3][3];
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j]='-';
            }
        }
        return a;
    }
}
