package methodOverloading;

public class PersonMain{
    public static void main(String[] args) {
    	
    	Person person1 = new Person("Sara");
    	Person person2 = new Person("Sara", 22);
    	Person person3 = new Person("Sara",22, "3-10,North Streew");
    	
        person1.displayDetails();
        person2.displayDetails();
        person3.displayDetails();
    }
}
class Person{
    private String name;
    private int age;
    private String address;

    public Person(String name) {
        this.name = name;
        this.age = 0; 
        this.address = "Not provided";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "Not provided";
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println();
    }
}


