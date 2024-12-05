class Vehicles{
	String brand;
	int year;
	
	void startEngine(){
		System.out.println("startEngine");
	}
}

class Car extends Vehicles{
	String fuelType;
	
	void startEngine(){
		System.out.println("Car engine starts");
	}
	
	void drive(){
		System.out.println("Car is driving");
	}
}

class Truck extends Vehicles{
	int loadCapacity;
	
	void startEngine(){
		System.out.println("Truck engine starts");
	}
	
	void haul(){
		System.out.println("Truck is hauling");
	}
}

public class Vehicle{
public static void main(String[] args){
		Car c1 = new Car();
		c1.brand = "BMW";
		System.out.println(c1.brand);
		c1.year = 2020;
		c1.fuelType = "Diesel";
		c1.startEngine();
		c1.drive();
		
		Truck t1 = new Truck();
		t1.brand = "Ashok Leyland";
		t1.year = 2010;
		t1.loadCapacity = 200;
		t1.startEngine();
		t1.haul();
	}
}

									//Super Keyword

/*class Person{
    String name;
    
    Person(String name){
        this.name = name;
    }
}

class Employee extends Person{
    Employee(String name){
        super(name);
    }
}

class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kasi");
        
        System.out.println("Emplyee name: "+e1.name);
    }
}*/