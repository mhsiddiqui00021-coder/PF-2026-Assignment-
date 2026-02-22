import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Print multiplication table from 1 to 10
        System.out.println("\nMultiplication Table of " + number + ":\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
