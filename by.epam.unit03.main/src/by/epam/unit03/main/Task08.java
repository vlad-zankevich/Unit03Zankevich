package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

        int x = 4;
        int y = 7;
        String a;
        double result = 0;
        boolean continueProgram = true;

        Scanner sc = new Scanner(System.in);
        while (continueProgram) {
            System.out.println("Enter an integer 'X value and press Enter\n>");
            x = sc.nextInt();
            System.out.println("Enter an integer 'Y' value and press Enter\n>");
            y = sc.nextInt();

            System.out.println("Enter the operand - what do you want to do with X and Y: +, -, /, *, and press Enter\n" +
                "If you want to stop the program, then enter '#' and press Enter\n>");
            a = sc.nextLine();

            switch (a) {
                case "+" -> result = x + y;
                case "-" -> result = x - y;
                case "/" -> result = (double) x / y;
                case "*" -> result = x * y;
                case "#" -> continueProgram = false;
                default -> System.out.println("Please enter correct operand: +, -, /, *, or enter # to stop the program");
            }
            System.out.println("The result Z is " + result);
        }
    }
}
