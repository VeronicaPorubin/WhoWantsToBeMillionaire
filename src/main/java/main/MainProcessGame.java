package main;

import Exception.InvalidScoreException;
import Exception.InvalidLevelException;


public class MainProcessGame {
    public static void main(String[] args) throws InvalidLevelException, InvalidScoreException {
        System.out.println("------Cine vrea sa devina MILIONAR?!------");
        System.out.println();
        WhileDevopsGame devopsGame = new WhileDevopsGame();
        devopsGame.startGame();

    }
}
