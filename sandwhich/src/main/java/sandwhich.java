import java.util.Scanner;

public class sandwhich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for sandwich size
        System.out.println("Welcome to the Sandwich Shop!");
        System.out.print("Enter #1 for small, #2 for large ");
        int size = scanner.nextInt();

        double basePrice;

        if (size == 1) {
            basePrice = 5.45;
        } else if (size == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("We don't have that size, you're getting small");
            basePrice = 5.45;
        }

        // Prompt for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        double discount = 0.0;

        // Apply discount
        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }

        // Calculate final price
        double finalPrice = basePrice - (basePrice * discount);

        // Display result
        System.out.printf("Your sandwich total is: $%.2f%n", finalPrice);

        scanner.close();
    }
}