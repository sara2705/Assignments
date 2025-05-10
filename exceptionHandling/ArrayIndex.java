package exceptionHandling;

public class ArrayIndex {
	public static void main(String[] args)
	{
		int[] arr=new int[] {1,3,4,6,6};
		try
		{
			System.out.println("Array length "+ (arr.length));
			int num=arr[arr.length+1];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
