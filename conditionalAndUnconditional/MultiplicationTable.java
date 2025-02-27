package conditionalAndUnconditional;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Table Number : ");
		int num=sc.nextInt(); //Table Number
		System.out.print("Enter the Range (Ex:10) : ");
		int range=sc.nextInt(); // range starts With 1 And ends with input we give 
		for(int i=1;i<=range;i++)
		{
			System.out.println(i+" x "+num+" = "+(num*i));
		}
		sc.close();
	}

}
