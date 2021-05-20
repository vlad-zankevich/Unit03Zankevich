package by.epam.unit03.main;

public class Task03 {
    public static void main(String[] args) {
        //Calculate: (1+2)*(1+2+3)*...*(1+2+...+10)

        int x = 1;
        int bracketsSum = 0;
        long total = 1;

        while (x <= 10) {
            bracketsSum = bracketsSum + x;
            total = total * bracketsSum;
            x++;

        }
        System.out.println("The result value is " + total);

    }
}
