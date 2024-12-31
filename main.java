import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
// hazme un calculadora que sume, reste, multiplique y divida
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
}

class multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose operation: add, subtract, multiply, divide");
        String operation = scanner.next();

        int resultInt;
        double resultDouble;

        switch (operation) {
            case "add":
                resultInt = calculator.add(num1, num2);
                System.out.println("Result: " + resultInt);
                break;
            case "subtract":
                resultInt = calculator.subtract(num1, num2);
                System.out.println("Result: " + resultInt);
                break;
            case "multiply":
                resultInt = calculator.multiply(num1, num2);
                System.out.println("Result: " + resultInt);
                break;
            case "divide":
                try {
                    resultDouble = calculator.divide(num1, num2);
                    System.out.println("Result: " + resultDouble);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }

        scanner.close();
    }
}


