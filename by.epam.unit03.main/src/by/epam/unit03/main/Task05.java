package by.epam.unit03.main;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        //Create a program for calculating the values of the function F(x)
        // on the segment [a, b] with a step h. Output the result as a table
        // with the first column containing the argument values and the second column
        // containing the corresponding function values: F(x) = 2tg(x/2) + 1

        double x;
        double y;
        int a;
        int b;
        int h = 0;

        System.out.println("This program will calculate the values of the function F(x)\n"
            + "on the segment [a, b] with a step h");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the \"a\" value\n" + ">  ");
        a = sc.nextInt();

        System.out.println("Please enter the \"b\" value\n" + ">  ");
        b = sc.nextInt();

        if (a <= b) {

            if (a < b) {
                System.out.println("Please enter the \"h\" - step value\n" + ">  ");
                h = sc.nextInt();
            }

            System.out.println("-------------------------");
            System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
            System.out.println("-------------------------");

            while (a <= b) {
                x = a;
                y = 2 * Math.tan(x / 2) + 1;
                System.out.printf("|\t%4.1f\t|\t%4.2f\t|\n", x, y);
                if (a == b) {
                    break;
                }
                a = a + h;
            }
                System.out.println("-------------------------");

        } else {
            System.out.println("The a value should be equal or less then b");
        }

    }
}
