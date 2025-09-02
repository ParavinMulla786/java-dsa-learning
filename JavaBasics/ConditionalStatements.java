import java.util.*;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // If - else
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Voter");
        } else {
            System.out.println("Not a voter");
        }

        // print if a number is odd or even
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // else-if statement -> Income Tax Calculator
        /*
           income < 5L = 0% tax
           income between 5L - 10L = 20% tax
           income > 10L = 30% tax
        */
        System.out.print("Enter Your Income: ");
        int income = sc.nextInt();
        int tax;

        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }

        System.out.println("Your tax is: " + tax);

        // Largest of 3 numbers
        System.out.print("Enter first number (A): ");
        int A = sc.nextInt();
        System.out.print("Enter second number (B): ");
        int B = sc.nextInt();
        System.out.print("Enter third number (C): ");
        int C = sc.nextInt();

        if ((A >= B) && (A >= C)) {
            System.out.println("A is Largest: " + A);
        } else if ((B >= A) && (B >= C)) {
            System.out.println("B is Largest: " + B);
        } else {
            System.out.println("C is Largest: " + C);
        }


    }
}
