import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, %, <<, >>, &, |, ^): ");
        String operator = scanner.next();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                break;
            case "%":
                result = num1 % num2;
                break;
            case "<<":
                result = (int) num1 << (int) num2;
                break;
            case ">>":
                result = (int) num1 >> (int) num2;
                break;
            case "&":
                result = (int) num1 & (int) num2;
                break;
            case "|":
                result = (int) num1 | (int) num2;
                break;
            case "^":
                result = (int) num1 ^ (int) num2;
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
