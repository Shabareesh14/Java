/*class Student{
	String name;
	int age;
	char grade;
	
	Student(String name,int age,char grade){
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	void displayDetails(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Grade: "+grade);
	}
}
class Main{
	public static void main(String[] args){
		Student stu = new Student("Shabareesh",22,'A');
		stu.displayDetails();
	}
}*/

class Car{
	String brand;
	String model;
	int year;
	
	Car(String brand,String model,int year){
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	void displayCarDetails(){
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
	}
}

class Main{
	public static void main(String[] args){
		Car cr = new Car("Toyota","Corolla",2022);
		cr.displayCarDetails();
	}
} 

/*class Vehicle{
    String brand;
    String model;
    int year;
    
    Vehicle(String brand,String model,int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    void displayVehicleDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }
}

class Car extends Vehicle{
    String fuelType;
    int numberOfDoors;

    Car(String brand,String model,int year,String fuelType,int numberOfDoors){
        super(brand,model,year);
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
    }
    void displayVehicleDetails(){
       super.displayVehicleDetails();
        System.out.println("FuelType: "+fuelType);
        System.out.println("NumberOfDoors: "+numberOfDoors);
    }
}

class Main{
    public static void main(String[] args){
        
        Car c1 = new Car("Toyota","Camry",2020,"Gasoline",4);
        
        c1.displayVehicleDetails();
    }
}*/