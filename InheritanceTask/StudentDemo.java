package InheritanceTask;

public class StudentDemo {
	public static void main(String[] args) {
        StudentChild student1 = new StudentChild("Saratha", 22, "Computer Science");
        StudentChild student2 = new StudentChild("Alice");
        System.out.println(student1);
        System.out.println(student2);
        
	}
}

class StudentParent {
	    String name;
	    int age;
	    
	    StudentParent(String name) {
	        this.name = name;
	    }
	    
	    StudentParent(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    @Override
	    public String toString() {
	        return "Name: " + name + ", Age: " + age;
	    }
	}

class StudentChild extends StudentParent {
	    String course;
	    
	    StudentChild(String name, int age, String course) {
	        super(name, age);
	        this.course = course;
	    }
	    
	    StudentChild(String name) {
	        super(name);
	    }
	    @Override
	    public String toString() {
	        return super.toString() + ", Course: " + course;
	    }
}