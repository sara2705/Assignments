package arrays;
import java.util.Scanner;
public class WeightCalculationJaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();
        int[][] weights = new int[n][];
        for (int i = 0; i < n; i++) {
            weights[i] = new int[0];
        }
        int choice;
        do {
            System.out.println("1. Add weight for a person");
            System.out.println("2. Find minimum weight of a person");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter person index to add weight: ");
                    int person = sc.nextInt();
                    System.out.print("Enter new weight: ");
                    int newWeight = sc.nextInt();
                    weights[person] = addWeight(weights[person], newWeight);
                    break;
                case 2:
                    System.out.print("Enter person index to find minimum weight: ");
                    int minPerson = sc.nextInt();
                    if (weights[minPerson].length == 0) {
                        System.out.println("No weights recorded for person " + minPerson);
                    } else {
                        System.out.println("Minimum weight of person " + minPerson + " is: " + findMinWeight(weights[minPerson]));
                    }
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }
    public static int[] addWeight(int[] weights, int newWeight) {
        int[] newArray = new int[weights.length + 1];
        System.arraycopy(weights, 0, newArray, 0, weights.length);
        newArray[weights.length] = newWeight;
        return newArray;
    }
    public static int findMinWeight(int[] weights) {
        int min = weights[0];
        for (int w : weights) {
            if (w < min) min = w;
        }
        return min;
    }
}
