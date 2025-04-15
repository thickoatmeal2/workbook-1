import java.util.Scanner;

public class BasicCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("What operation would you like to perform? (add, subtract, multiply, divide): ");
        String operation = scanner.next();

        double result = num1 * num2;

        System.out.printf("Result of multiplying %.2f and %.2f is %.2f%n", num1, num2, result);

        scanner.close();
    }
}