package InheritanceTask;

public class VehicleMain {
	public static void main(String[] args) {
        System.out.println("Example of Vehicle Hierarchy:");
        
        TwoWheeler bike = new TwoWheeler("Yamaha", "Sports");
        bike.displayInfo();
        
        FourWheeler car = new FourWheeler("Toyota", "SUV");
        car.displayInfo();
    }
}
abstract class Vehicle {
    String brand;
    int wheels;
    
    Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }
    
    abstract void displayInfo();
}

class TwoWheeler extends Vehicle {
    String type;
    
    TwoWheeler(String brand, String type) {
        super(brand, 2);
        this.type = type;
    }
    
    @Override
    void displayInfo() {
        System.out.println("Two-Wheeler Brand: " + brand + ", Type: " + type + ", Wheels: " + wheels);
    }
}

class FourWheeler extends Vehicle {
    String type;
    
    FourWheeler(String brand, String type) {
        super(brand, 4);
        this.type = type;
    }
    
    @Override
    void displayInfo() {
        System.out.println("Four-Wheeler Brand: " + brand + ", Type: " + type + ", Wheels: " + wheels);
    }
}
