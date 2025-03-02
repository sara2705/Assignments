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
        int atidx = -1, dotidx = -1;
        boolean atFound = false;
        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (ch == '@') {
                if (atFound) return false;
                atidx = i;
                atFound = true;
            } else if (ch == '.') {
            	dotidx = i;
            }
        }
        return atidx > 0 && dotidx > atidx + 1 && dotidx < email.length() - 1;
	}

}
