package by.epam.unit03.main;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        //Two numbers are given. Determine the digits that are included in the record
        // of both the first and second numbers.

        int x;
        int y;
        int tempX;
        int tempY;

        System.out.println("Print an integer value and press Enter\n>");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        System.out.println("Print an integer value and press Enter\n>");
        y = sc.nextInt();

        if (x != 0) {
            if (x < 0) {
                x = x * -1;
            }
            System.out.println("The numbers of your first entered value are:");
            while (x >= 1) {
                tempX = x % 10;
                System.out.println(tempX);
                x = x / 10;
            }
        } else System.out.println("The number of your entered value is:\n0");

        if (y != 0) {
            if (y < 0) {
                y = y * -1;
            }
            System.out.println("The numbers of your second entered value are:");
            while (y >= 1) {
                tempY = y % 10;
                System.out.println(tempY);
                y = y / 10;
            }
        } else System.out.println("The number of your entered value is:\n0");

    }
}
