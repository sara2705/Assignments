package abstractClassesAndMethods;

import java.util.Scanner;

public class EmployeeDemo {
	 public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	     System.out.println("Enter type of employee (hourly/salaried): ");
	     String type = scanner.nextLine();
	     
	     Employee employee;
	     
	     if (type.equalsIgnoreCase("hourly")) {
	         System.out.println("Enter name: ");
	         String name = scanner.nextLine();
	         System.out.println("Enter ID: ");
	         int id = scanner.nextInt();
	         System.out.println("Enter hourly rate: ");
	         double hourlyRate = scanner.nextDouble();
	         System.out.println("Enter hours worked: ");
	         int hoursWorked = scanner.nextInt();
	         employee = new HourlyEmployee(name, id, hourlyRate, hoursWorked);
	         employee.getEmployeeDetails();
		     System.out.println("Calculated Pay: " + employee.calculatePay());
	         
	     } else if(type.equalsIgnoreCase("salaried")) {
	         System.out.println("Enter name: ");
	         String name = scanner.nextLine();
	         System.out.println("Enter ID: ");
	         int id = scanner.nextInt();
	         System.out.println("Enter salary: ");
	         double salary = scanner.nextDouble();
	         employee = new SalariedEmployee(name, id, salary);
	         employee.getEmployeeDetails();
		     System.out.println("Calculated Pay: " + employee.calculatePay());
	     }
	     else
	    	 System.out.println("You Entered Wrong Option");
	     
	     
	     scanner.close();
	 }
}
abstract class Employee {
 protected String name;
 protected int id;

 public Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 public void getEmployeeDetails() {
     System.out.println("Employee ID: " + id);
     System.out.println("Employee Name: " + name);
 }

 public abstract double calculatePay();
}

class HourlyEmployee extends Employee {
 private double hourlyRate;
 private int hoursWorked;

 public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
     super(name, id);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 @Override
 public double calculatePay() {
     return hourlyRate * hoursWorked;
 }
}

class SalariedEmployee extends Employee {
 private double salary;

 public SalariedEmployee(String name, int id, double salary) {
     super(name, id);
     this.salary = salary;
 }

 @Override
 public double calculatePay() {
     return salary;
 }
}

