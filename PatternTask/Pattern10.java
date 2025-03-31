package PatternTask;

import java.util.Scanner;

public class Pattern10 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the n :");
			int n=sc.nextInt();
			int m = 2*n-1;
			for(int i=0;i<m;i++) {
				for(int j=0;j<m;j++) {			
					if(i<n && (i>=j || j>=m-i-1)) {
						if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					else if(i>=n && (j<=m-i-1 || j>=i)) {
						if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}

	}