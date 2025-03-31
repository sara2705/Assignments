package PatternTask;

import java.util.Scanner;

public class Pattern25 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i%2==0 && j%2==0)||(i%2!=0 && j%2!=0))
				{
					System.out.print("* ");
				}
				else 
				System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if((i%2==0 && j%2==0)||(i%2!=0 && j%2!=0))
				{
					System.out.print("* ");
				}
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}
