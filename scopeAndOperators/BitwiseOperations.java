package scopeAndOperators;

import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Bitwise AND: " + (num1 & num2));
        System.out.println("Bitwise OR: " + (num1 | num2));
        System.out.println("Bitwise XOR: " + (num1 ^ num2));
        
        System.out.print("How many times you want to perform shift : ");
        int n=sc.nextInt();
        
        System.out.println("Left Shift num1: " + (num1 << n));
        System.out.println("Right Shift num1 : " + (num1 >> n));

        sc.close();
    }
}

