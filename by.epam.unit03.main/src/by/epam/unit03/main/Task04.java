package by.epam.unit03.main;

public class Task04 {
    public static void main(String[] args) {
        double x = -5;
        double y;
        System.out.println("-------------------------");
        System.out.printf("|%8s\t|%8s\t|\n", "x", "y");
        System.out.println("-------------------------");

        while(x <= 5) {
            y = 5 - (Math.pow(x, 2)) / 2;
            System.out.printf("|\t%4.1f\t|\t%4.3f\t|\n", x, y);
            x = x + 0.5;
        }
        System.out.println("-------------------------");

    }
}
