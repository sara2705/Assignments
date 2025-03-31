package PatternTask;

import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int space=0;space<i;space++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
