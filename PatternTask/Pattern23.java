package PatternTask;

import java.util.Scanner;

public class Pattern23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			for(int space=1;space<i;space++)
			{
				 System.out.print(" ");
			}
            for (int j=1;j<=n;j++) {
            	if(i==1|| j==1 || i+j==n+1)
            		System.out.print("* ");
            	else
            		System.out.print("  ");
            }
            
            System.out.println();
        }

		for (int i=2;i<=n;i++) {
			for(int space=1;space<=n-i;space++)
			{
				 System.out.print(" ");
			}
            for (int j=1;j<=i;j++) {
            	if(j==1 || j==i || i==n)
            		System.out.print("* ");
            	else
            		System.out.print("  ");
            }
            
            System.out.println();
        }
	}
}
