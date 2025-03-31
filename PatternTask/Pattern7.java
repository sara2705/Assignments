package PatternTask;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int space=0;space<=n-i-1;space++)
			{
				System.out.print("  ");
			}
			int num=i;
			for(int j=1;j<=i*2-1;j++)
			{
				if(j>=i)
					System.out.print(num+++" ");
				else 
					System.out.print(num--+" ");
			}
			System.out.println();
		}
	}

}
