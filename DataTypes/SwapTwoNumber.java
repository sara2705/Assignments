import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // using temp variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);

        // using arithmetic operation
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a+" "+b);

        //using xor operation
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a+" "+b);

        sc.close();
    }
}
