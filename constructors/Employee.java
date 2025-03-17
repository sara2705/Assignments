package constructors;
import java.util.HashMap;

public class Employee {

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

    // Constructor
    public Employee(String name, int employeeId, String department, double salary, String ssn, String email, String phoneNumber, String address, String jobTitle, String joiningDate) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
        this.ssn = ssn;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.jobTitle = jobTitle;
        this.joiningDate = joiningDate;
    }

    // Getters
    public String getName() { return name; }
    public int getEmployeeId() { return employeeId; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
    public String getJobTitle() { return jobTitle; }
    public String getJoiningDate() { return joiningDate; }
    public String getSSN() { return ssn; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setEmail(String email) { this.email = email; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setAddress(String address) { this.address = address; }
    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }
    public void setHireDate(String joiningDate) { this.joiningDate = joiningDate; }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("SSN: " + ssn);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Joining Date: " + joiningDate);
    }

    public static void main(String[] args) {
    	
        HashMap<Integer, Employee> employeeMap = new HashMap<>();

        Employee employee1 = new Employee("John Doe", 1001, "Engineering", 75000.00, "123-45-6789", "john.doe@example.com", "9876543210", "123 Main Street, City, Country", "Software Engineer", "2022-01-15");
        Employee employee2 = new Employee("Jane Smith", 1002, "Marketing", 68000.00, "987-65-4321", "jane.smith@example.com", "87362426911", "456 Elm Street, City, Country", "Marketing Manager", "2021-06-10");

        employeeMap.put(employee1.getEmployeeId(), employee1);
        employeeMap.put(employee2.getEmployeeId(), employee2);

        int searchId = 1002;
        if (employeeMap.containsKey(searchId)) {
            System.out.println("Employee Details for ID " + searchId + ":");
            employeeMap.get(searchId).displayEmployeeDetails();
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
    }
}
