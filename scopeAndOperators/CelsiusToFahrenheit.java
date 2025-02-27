package scopeAndOperators;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter temperature in Celsius: ");
	     double cel = sc.nextDouble();
	     double fahren = (cel * 9.0 / 5.0) + 32.0;
	     System.out.println("fahrenheit :"+ fahren + "°F");
	     sc.close();
	}

}
