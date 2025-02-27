package conditionalAndUnconditional;

import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student MarkS");
		int[] markArray=new int[5];// 5 Subject Array
		int i=0;
		while(i<5)
		{
			System.out.print("Enter Subject "+(i+1)+" mark : ");
			int mark=sc.nextInt();
			if(mark<0 || mark >100) // This condition will ensure that mark won't be negative and above 100
			{
				System.out.println("Please Enter valid Mark for Subject "+(i+1));
				continue;
			}
			markArray[i++]=mark;
		}
		sc.close();
		for(i=0;i<5;i++)
		{
			int grade=markArray[i]/10;
			System.out.print("Subject "+(i+1));
			switch(grade)
			{
				case 10,9:{
					System.out.print(" Grade O");
					break;
				}
				case 8:{
					System.out.print(" Grade A");
					break;
				}
				case 7:{
					System.out.print(" Grade B");
					break;
				}
				case 6:{
					System.out.print(" Grade C");
					break;
				}
				case 5:{
					System.out.print(" Grade D");
					break;
				}
				default: {
					System.out.print(" fail");
				}
			}
			System.out.println();
		}
		
	}

}
