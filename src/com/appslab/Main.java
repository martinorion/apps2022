package com.appslab;

public class Main {

    public static void main(String[] args) {

        System.out.println(gameRPS("paper","rock"));
        System.out.println(gameRPS("scissors","rock"));
        System.out.println(gameRPS("paper","paper"));

    }

    static String gameRPS(String player1, String player2)
    {
       if(player1 == "rock" && player2 == "scissors" || player1 == "scissors" && player2 == "paper" || player1 == "paper" && player2 == "rock"){
       return "Player one wins";
       }
        if(player2 == "rock" && player1 == "scissors" || player2 == "scissors" && player1 == "paper" || player2 == "paper" && player1 == "rock"){
            return "Player two wins";
        }
        return "Tie";
    }
}
