package PatternTask;

import java.util.Scanner;

public class Pattern20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
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
