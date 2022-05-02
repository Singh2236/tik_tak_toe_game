package com.games.navpreet;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args){
        TheGame play1 = new TheGame();

        //The method of play one which is responsible for playing the game simultaneously
        Thread t1 = new Thread(play1);
        t1.start();
    }
}
