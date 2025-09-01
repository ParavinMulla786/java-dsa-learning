import java.util.*;   // Imports Scanner class for input

public class Operations {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); // Create scanner object to take input

        int a = sc.nextInt();  // Take first integer input
        int b = sc.nextInt();  // Take second integer input

        int addition = a + b;          // Addition
        int subtraction = a - b;       // Subtraction
        int multiplication = a * b;    // Multiplication
        int division  = a / b;         // Division (integer division)
        int remainder = a % b;         // Remainder (modulus)

        System.out.println(addition);       // Print addition result
        System.out.println(subtraction);    // Print subtraction result
        System.out.println(multiplication); // Print multiplication result
        System.out.println(division);       // Print division result
        System.out.println(remainder);      // Print remainder
    }
}
