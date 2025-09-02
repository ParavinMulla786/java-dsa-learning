import java.util.*;

public class Loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        While Loop
        Q. Print 100 Times Hello World
         */
        int counter = 0;
        while (counter < 100) {
            System.out.println("Hello World");
            counter++;
        }
        System.out.println("Printed Hello World 100 Times");
        System.out.println("*---------------------------------------------------------*");

        /*
        Print numbers from 1 to 100
         */
        int counter1 = 1;
        while (counter1 <= 100) {
            System.out.print(counter1 + " ");
            counter1++;
        }
        System.out.println("\n*---------------------------------------------------------*");

        /*
        For Loop
        Print Hello 10 Times
         */
        for (int j = 1; j <= 10; j++) {
            System.out.println("Hello");
        }
        System.out.println("\n*---------------------------------------------------------*");

        /*
        Q. Print Reverse of a number
         */
        int n = 27604;
        System.out.print("Reverse of " + n + " = ");
        while (n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }
        System.out.println("\n*---------------------------------------------------------*");

        /*
        Print sum of first n natural numbers
         */
        System.out.print("Enter a number: ");
        int m = sc.nextInt();
        int sum = 0;
        int k = 1;
        while (k <= m) {
            sum += k;
            k++;
        }
        System.out.println("Sum of first " + m + " natural numbers = " + sum);
        System.out.println("\n*---------------------------------------------------------*");

        /*
        Do-While Loop
        Print Welcome 10 times
         */
        int counter3 = 1;
        do {
            System.out.println("Welcome");
            counter3++;
        } while (counter3 <= 10);
        System.out.println("*---------------------------------------------------------*");

        /*
        Break
        Keep entering numbers till user enters a multiple of 10
         */
        System.out.println("Enter numbers (loop will stop when you enter a multiple of 10):");
        do {
            int v = sc.nextInt();
            if (v % 10 == 0) {
                System.out.println("Multiple of 10 entered! Loop terminated.");
                break;
            }
            System.out.println("You entered: " + v);
        } while (true);


    }
}
