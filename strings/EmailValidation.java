package strings;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String email = sc.nextLine().trim();
        if (isValidEmail(email)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
	}

	private static boolean isValidEmail(String email) {
		// TODO Auto-generated method stub
		if (email == null || email.length() < 5) {
            return false;
        }
		if(!email.contains("@")) return false;
		int domainStart=-1;
		for(int i=0;i<email.length();i++)
		{
			if(email.charAt(i)=='@')
			{
				domainStart=i+1;
			}
		}
		String userName=email.substring(0,domainStart-1);
		if(userName.charAt(0)=='.'||!(checkUserName(userName)))
		{
			return false;
		}
		String domainName=email.substring(domainStart, email.length());
		if(!(checkDomain(domainName)))
		{
			return false;
		}
		return true;
	}

	private static boolean checkDomain(String domainName) {
		// TODO Auto-generated method stub
		if(!(domainName.contains(".")))
			return false;
		if(domainName.length()<5) return false;
		String spl="!#$%&'*+/=?^_{|}~";
		for(int i=0;i<domainName.length();i++)
		{
			if(spl.contains(""+domainName.charAt(i))) return false;
		}
		return true;
	}

	private static boolean checkUserName(String username) {
		// TODO Auto-generated method stub
		return username.length()>3 &&  !(username.contains(" ")) && !(username.contains(",")) && !(username.contains("<>")) && !(username.contains("[]")) && !(username.contains("..")) && !(username.contains("()"));
	}

}
