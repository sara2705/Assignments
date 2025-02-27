import java.util.Scanner;

public class AverageWeightCalculation {
    public static void main(String[] args) {
        final int NO_OF_PERSONS=10;
        double totalWeight=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<NO_OF_PERSONS;i++)
        {
            System.out.print("Enter person "+(i+1)+" weight: ");
            double weight=sc.nextDouble();
            totalWeight+=weight;
        }
        double avgWeight=totalWeight/NO_OF_PERSONS;
        System.out.println("Average Weight of "+NO_OF_PERSONS+" persons are: "+avgWeight);
        sc.close();
    }
}
