package com.company;
import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
    public static void main(String[] args) {
        int count=0;
        int count_win=0;
        int count_lose=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many games you want to play");
        int c=sc.nextInt();
        for(int h=1;h<=c;h++) {
            System.out.println("Enter 0 for rock");
            System.out.println("Enter 1 for paper");
            System.out.println("Enter 2 for scissors");
            System.out.println("Enter your choice");
            int i = sc.nextInt();
            Random rn = new Random();
            int j = rn.nextInt(3);
            if (i == 0 && j == 2) {
                System.out.println("You won, computer chose scissor");
                count_win += 1;
            } else if (i == 0 && j == 0)
                System.out.println("Its a tie");
            else if (i == 0 && j == 1) {
                System.out.println("You lost, computer chose paper");
                count_lose += 1;
            } else if (i == 1 && j == 0) {
                System.out.println("You won, computer chose rock");
                count_win += 1;
            } else if (i == 1 && j == 1)
                System.out.println("Its a tie");
            else if (i == 1 && j == 2) {
                System.out.println("You lost, computer chose scissor");
                count_lose += 1;
            } else if (i == 2 && j == 0) {
                System.out.println("You lost, computer chose rock");
                count_lose += 1;
            } else if (i == 2 && j == 1) {
                System.out.println("You won, computer chose paper");
                count_win += 1;
            } else if (i == 2 && j == 2)
                System.out.println("Its a tie");
        }
        if(count_lose==count_win)
            System.out.println("The game is a tie");
        else if(count_lose>count_win)
            System.out.println("You lost");
        else if(count_win>count_lose)
            System.out.println("You won");

    }
}
