package com.games.navpreet;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        /*TheGame play1 = new TheGame();
        //The method of play one which is responsible for playing the game simultaneously
        Thread t1 = new Thread(play1);
        t1.start();*/
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            out.println("1. SignUp 2. LogIn");
            String input = scanner.next();
            if (input.equals("1")) {
                out.print("Username: ");
                String name = scanner.next();
                out.print("Password: ");
                String pass = scanner.next();
                //scanner.next();
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
