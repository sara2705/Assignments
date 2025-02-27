package conditionalAndUnconditional;

import java.util.Scanner;

public class GreatestAmongThreeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value A: ");
		int a=sc.nextInt();
		System.out.print("Enter value B: ");
		int b=sc.nextInt();
		System.out.print("Enter value C: ");
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is the greatest");
		}
		else if(b>c)
		{
			System.out.println("B is the greatest");
		}
		else
		{
			System.out.println("C is the greatest");
		}
		sc.close();
	}

}
