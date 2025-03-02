package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		StringBuilder sb=new StringBuilder(str);
		int i=0,j=str.length()-1;
		while(i<j) {
			char temp = sb.charAt(i);
			sb.setCharAt(i,sb.charAt(j));
			sb.setCharAt(j, temp);
			i++;
			j--;
		}
		System.out.println("Reverse String : "+sb.toString());
		sc.close();

	}

}
