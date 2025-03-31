package PatternTask;

import java.util.Scanner;

public class Pattern24 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int space=0;space<n-i-1;space++)
			{
				System.out.print(" ");
			}
			int num=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num=num*(i-j)/(j+1);
			}
			System.out.println();
		}
	}
}
