package by.epam.unit03.main;

public class Task02 {
    public static void main(String[] args) {

        //Use the while operator to determine the sum of all odd numbers in the range from 1 to 99 inclusive

        int x = 1;
        int sum = 0;

        while (x <= 99) {
            if (x % 2 != 0) {
                sum = sum + x;
            }
            x++;

        }
        System.out.println("The sum of all odd numbers in the range from 1 to 99 inclusive = " + sum);
    }

}
