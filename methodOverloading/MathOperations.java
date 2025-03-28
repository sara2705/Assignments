package methodOverloading;

public class MathOperations {
	
	public static void main(String[] args) {
        System.out.println("Addition: " + add(5, 3)); 
        System.out.println("Addition: " + add(5.5, 3.2)); 
        System.out.println("Subtraction: " + subtract(10, 4));
        System.out.println("Multiplication: " + multiply(7, 2));
        System.out.println("Division: " + divide(10, 2));
    }


	//Addition
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

    
