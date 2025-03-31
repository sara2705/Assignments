package PatternTask;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int num= i%2==0 ? 0: 1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num=num==0?1:0;
			}
			System.out.println();
		}
	}

}
