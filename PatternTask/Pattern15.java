package PatternTask;

import java.util.Scanner;

public class Pattern15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows : ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			for(int space=1;space<i;space++)
			{
				System.out.print("  ");
			}
           for (int j=1;j<=n-i+1;j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
	}
}
