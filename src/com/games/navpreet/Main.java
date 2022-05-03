package com.games.navpreet;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        out.println("WELCOME TO TICK TAK TOE GAME");
        out.println("Please sign in to play the game.");

        while (flag) {
            out.println("1. SignUp 2. LogIn");
            String input = scanner.next();
            if (input.equals("1")) {
                out.print("Username: ");
                String name = scanner.next();
                out.print("Password: ");
                String pass = scanner.next();
                
                userData userData = new userData();
                userData.registration(name, pass);
            }
            else if (input.equals("2")) {
                out.print("Username: ");
                String nameAuth = scanner.next();
                out.print("Password: ");
                String passAuth = scanner.next();
                if (userData.authentication(nameAuth, passAuth)) {
                    out.println("LogIn Successful");


                    boolean playing = true;
                    while (playing) {
                        out.print("1. play 2. quit: ");
                        if (scanner.next().equals("1")) {
                            TheGame game = new TheGame();
                            Thread t1 = new Thread(game, "game thread");
                            t1.start();
                            t1.join();
                        }
                        else if (scanner.next().equals("2")) {
                            playing = false;
                            out.println("Quiting ");
                        }
                    }
                }
                else {
                    out.println("Wrong credentials ");
                }
            }
            else {
                out.println("please type 1 or 2");
            }


        }

    }
}
