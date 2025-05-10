package exceptionHandling;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Age ");
		int age=sc.nextInt();
		try
		{
			isValid(age);
		}
		catch(IllegealAgeException e)
		{
			System.out.println(e.getMessage());
		}
	}

	private static void isValid(int age) {
		// TODO Auto-generated method stub
		if(age<18) throw new IllegealAgeException("Not valid age");
		else System.out.print("valid Age");
		
	}

}
class IllegealAgeException extends RuntimeException{
	public IllegealAgeException(String m)
	{
		super(m);
	}
}
