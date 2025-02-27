package scopeAndOperators;

import java.util.Scanner;

public class QuadraticFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a :");
		double a=sc.nextDouble();
		System.out.print("Enter b :");
		double b=sc.nextDouble();
		System.out.print("Enter c :");
		double c=sc.nextDouble();
		
		double root=(b*b)-(4*a*c);
		double ans1=(-b+root)/(2*a*c);
		double ans2=(-b-root)/(2*a*c);
		
		System.out.println("Ans 1:"+ans1);
		System.out.println("Ans 2:"+ans2);
		
	}

}
