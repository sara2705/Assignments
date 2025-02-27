package conditionalAndUnconditional;

import java.util.Scanner;

public class SecondOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the number You Want to Search 2nd Ocuurence: ");
		int search=sc.nextInt();
		sc.close();
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(search==arr[i])
				count++;
			if(count==2)
			{
				System.out.println("2nd Occurence of "+search+" found at index "+i);
				return;
			}
		}
		System.out.println("2nd occurence not found");
		
	}

}
