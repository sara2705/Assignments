package methodOverriding;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new HourlyEmployee("sara", 101, "IT", 180.0, 280, "Developer", "2022-01-15");
        Employee emp2 = new SalariedEmployee("saratha", 102, "HR", 60000, "Manager", "2020-05-20");

        System.out.println("\nEmployee Details:");
        System.out.println(emp1.getEmployeeDetails());
        System.out.println("\nEmployee Details:");
        System.out.println(emp2.getEmployeeDetails());
	}

}
class Employee {
	private String name;
    private int employeeId;
    private String department;
    private double salary;
    private String ssn;
    private String email;
    private String phoneNumber;
    private String address;
    private String jobTitle;
    private String joiningDate;

    public Employee(String name, int employeeId, String department, double salary, String jobTitle, String joiningDate) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.joiningDate = joiningDate;
    }

    public String getEmployeeDetails() {
        return "Employee ID: " + employeeId + "\nName: " + name + "\nDepartment: " + department + "\nSalary: " + salary + "\nJob Title: " + jobTitle + "\nJoining Date: " + joiningDate;
    }
}
class HourlyEmployee extends Employee{
	private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int employeeId, String department, double hourlyRate, int hoursWorked, String jobTitle, String joiningDate) {
        super(name, employeeId, department, hourlyRate * hoursWorked, jobTitle, joiningDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + "\nHourly Rate: " + hourlyRate + "\nHours Worked: " + hoursWorked;
    }
}
class SalariedEmployee extends Employee{
	private double annualSalary;

    public SalariedEmployee(String name, int employeeId, String department, double annualSalary, String jobTitle, String joiningDate) {
        super(name, employeeId, department, annualSalary / 12, jobTitle, joiningDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + "\nAnnual Salary: " + annualSalary;
    }
}

