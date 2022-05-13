package main;


import help.PhoneHelp;
import main.WhileDevopsGame;

public class MainProcessGame {
    public static void main(String[] args) {
        System.out.println("------Cine vrea sa devina MILIONAR?!------");
        System.out.println();
        WhileDevopsGame devopsGame = new WhileDevopsGame();
        devopsGame.startGame();

    }
}
