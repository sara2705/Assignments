package exceptionHandling;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int n=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.print(e.getMessage()+" Exception");
		}
	}

}
