package classesandObjects;

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


    // Getters
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getjoiningDate() {
        return joiningDate;
    }

    public String getSSN() {
        return ssn;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setHireDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    

    
}
