package PatternTask;

import java.util.Scanner;

public class Pattern13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
            for (int j=i;j<=n;j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
	}
}
