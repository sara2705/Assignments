package arrays;

import java.util.Scanner;
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int value = 1, top = 0, bottom = n - 1, left = 0, right = n - 1;
        while (value <= n * n) {
            for (int i = left; i <= right; i++) 
            	arr[top][i] = value++;
            top++;
            for (int i = top; i <= bottom; i++) 
            	arr[i][right] = value++;
            right--;
            for (int i = right; i >= left; i--) 
            	arr[bottom][i] = value++;
            bottom--;
            for (int i = bottom; i >= top; i--) 
            	arr[i][left] = value++;
            left++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
