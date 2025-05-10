package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		char ch='A';
		for(int i=0;i<10;i++)
		{
			al.add((char)(ch+i));
		}
		System.out.println(al);
		System.out.print("Enter the character to be searched :");
		ch=sc.next().charAt(0);
		int index=findElement(al,ch);
		if( index<0)
			System.out.println("Not Found");
		else
			System.out.println("Fount at : "+index);
	}

	private static int findElement(ArrayList<Character> al, char ch) {
		// TODO Auto-generated method stub
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)==ch) return i;
		}
		return -1;
	}

}
