package PatternTask;

import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int space=0;space<n-i-1;space++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int space=0;space<=i;space++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
