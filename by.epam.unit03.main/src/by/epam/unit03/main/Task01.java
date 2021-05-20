package by.epam.unit03.main;

public class Task01 {
    public static void main(String[] args) {

        //Display the multiplication table by 3

        int x = 3;
        int y = 1;

        System.out.println("The multiplication table by 3 is:");

        while(y <= 10) {
            System.out.println("3 * " + y + " = " + x * y);
            y++;

        }

    }
}
