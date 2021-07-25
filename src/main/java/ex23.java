/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        System.out.println("Is the car silent when you turn the key?");
        Scanner an1 = new Scanner(System.in);
        if (an1.nextLine().toLowerCase().startsWith("y")) {
            System.out.println("Are the battery terminals corroded?");
            Scanner an2 = new Scanner(System.in);
            if (an2.nextLine().toLowerCase().startsWith("y")){
                System.out.println("Clean terminals and try starting again.");
            } else {
                System.out.println("Replace cables and try again.");
            }
        } else {
            System.out.println("Does the car make a slicking noise?");
            Scanner an3 = new Scanner(System.in);
            if (an3.nextLine().toLowerCase().startsWith("y")) {
                System.out.println("Replace the battery.");
            } else {
                System.out.println("Does the car crank up but fail to start?");
                Scanner an4 = new Scanner(System.in);
                if (an4.nextLine().toLowerCase().startsWith("y")) {
                    System.out.println("Check spark plug connections");
                } else {
                    System.out.println("Does the engine start and then die?");
                    Scanner an5 = new Scanner(System.in);
                    if (an5.nextLine().toLowerCase().startsWith("y")) {
                        System.out.println("Does your car have fuel injection?");
                        Scanner an6 = new Scanner(System.in);
                        if (an6.nextLine().toLowerCase().startsWith("y")) {
                            System.out.println("Get it in for service");
                        } else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    } else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
