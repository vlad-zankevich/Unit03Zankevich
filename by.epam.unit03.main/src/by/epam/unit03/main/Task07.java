package by.epam.unit03.main;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        //Write a program that converts Roman numbers to Arabic numbers.

        String a;
        System.out.println("Please enter only one Roman number in upper case: I, V, X, L, C, D, M\n>");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();

        switch (a) {
            case "I":
                System.out.println("The Roman I is 1");
                break;
            case "V":
                System.out.println("The Roman V is 5");
                break;
            case "X":
                System.out.println("The Roman X is 10");
                break;
            case "L":
                System.out.println("The Roman L is 50");
                break;
            case "C":
                System.out.println("The Roman C is 100");
                break;
            case "D":
                System.out.println("The Roman D is 500");
                break;
            case "M":
                System.out.println("The Roman M is 1000");
                break;
            default:
                System.out.println("Sorry, but there are no such Roman numbers");
        }

    }
}
