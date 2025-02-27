package conditionalAndUnconditional;

import java.util.Scanner;

public class SumOfEvenNumbers {

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
		int sum=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2!=0) continue; // skip the odd numbers
			sum+=arr[i];
		}
		System.out.println("Sum of Even Numbers in a Array is : "+sum);
		sc.close();
	}

}
