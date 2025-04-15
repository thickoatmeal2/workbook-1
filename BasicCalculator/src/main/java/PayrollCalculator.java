import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name");
        String name = scanner.nextLine();

        System.out.print("How many hours did you work?");
        double hours = scanner.nextDouble();

        System.out.print("What is your pay rate?");
        double Rate = scanner.nextDouble();

        double grossPay = Rate * hours;

        System.out.printf("Employee Name: %s%n", name);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);

        scanner.close();


    }
}
