package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter Phone Number");
			int n=sc.nextInt();
			System.out.println("Phone Number :"+n);
		}
		catch(InputMismatchException e)
		{
			System.out.print("Invalid input. Please enter an integer.");
		}
	}

}
