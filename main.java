import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int a = 0; 
        int b = 0;
        int c = 0;
        a = 5;
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
class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test addition
        System.out.println("Addition: " + calculator.add(5, 3)); // Output: 8

        // Test subtraction
        System.out.println("Subtraction: " + calculator.subtract(5, 3)); // Output: 2

        // Test multiplication
        System.out.println("Multiplication: " + calculator.multiply(5, 3)); // Output: 15

        // Test division
        try {
            System.out.println("Division: " + calculator.divide(5, 3)); // Output: 1.666...
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Test division by zero
        try {
            System.out.println("Division by zero: " + calculator.divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // Output: Division by zero is not allowed.
        }
    }
}
class multiply {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int b = 67;
        int r = 45; 

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

        int G = 245; 
        int y = 3;

        scanner.close();
    }
}

