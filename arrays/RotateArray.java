package arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the rotate Count: ");
        int k = scanner.nextInt();
        k = k % n;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k );
        reverse(arr, k+1, arr.length - 1);
        System.out.println("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

