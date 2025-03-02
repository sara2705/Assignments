package strings;

import java.util.Scanner;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter a String: ");
	     String str = sc.nextLine();
	     char[] strArray = str.toCharArray();
	     boolean flag = true;
	     for (int i = 0; i < strArray.length; i++) {
	    	 if (Character.isLetter(strArray[i]) && flag) {
	    		 strArray[i] = Character.toUpperCase(strArray[i]);
	    		 flag = false;
	         } 
	    	 else if (strArray[i] == ' ') {
	    		 flag = true;
	         }
	     }
	     System.out.println(strArray);
	       
	}

}
