package PatternTask;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int start=1;
		System.out.print("Enter the rows : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(start++ +" ");
			}
			System.out.println();
		}
	}
}
