package com.botchan;
import java.io.File;
import java.util.*;

public class Main {

    static Commands cmd = new Commands();
    static Scanner sc = new Scanner(System.in);
    static int running = 0;



    public static void start() {

        System.out.print(" __________________________    _____              _____                   ____                   __________________\n" +
                "|                          |  |     |            |     |                 / /\\ \\                 |                  |\n" +
                "|   _______________________|  |     |            |     |                / /  \\ \\                |     _________    |\n" +
                "|   |                         |     |            |     |               / /    \\ \\               |    |         |   |\n" +
                "|   |                         |     |            |     |              / /      \\ \\              |    |         |   |\n" +
                "|   |                         |     |            |     |             / /        \\ \\             |    |         |   |\n" +
                "|   |                         |     |____________|     |            / /__________\\ \\            |    |         |   |       ____________________________\n" +
                "|   |                         |                        |           / /            \\ \\           |    |         |   |      |                            |\n" +
                "|   |                         |                        |          / /______________\\ \\          |    |         |   |      |                            |\n" +
                "|   |                         |                        |         / /                \\ \\         |    |         |   |      |            BOT             |\n" +
                "|   |                         |      ____________      |        / /                  \\ \\        |    |         |   |      |                            |\n" +
                "|   |                         |     |            |     |       / /                    \\ \\       |    |         |   |      |____________________________|\n" +
                "|   |                         |     |            |     |      / /                      \\ \\      |    |         |   |\n" +
                "|   |                         |     |            |     |     / /                        \\ \\     |    |         |   |\n" +
                "|   |                         |     |            |     |    / /                          \\ \\    |    |         |   |\n" +
                "|   |_______________________  |     |            |     |   / /                            \\ \\   |    |         |   |\n" +
                "|                          |  |     |            |     |  / /                              \\ \\  |    |         |   |\n" +
                "|__________________________|  |_____|            |_____| /_/                                \\_\\ |____|         |___|\n" +
                "\n" +
                "\n");
    }

    public static void main(String[] args) throws InterruptedException {
        start();
        System.out.println("For docs go to: www.example.com");
        Thread.sleep(1000);
        running = 1;
        int profileNum = 0;
        String profileNameTemp = null;
        while (running == 1) {
            System.out.println("Enter commands to build bot or 0 to exit");
            String command = sc.nextLine();
            if(Objects.equals(command, "0")) {
                System.out.println("Thank you for using Chan-Bot");
                break;
            }

            else {
                System.out.println("Not valid syntax, please try again or look at the docs: www.example.com");
            }

        }







        }


}
