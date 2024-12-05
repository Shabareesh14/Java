/*class Rectangle{
	
	double area(float length ,float breadth){
		return length*breadth;
	}
}

public class Area{
	public static void main(String[] args){
		
		Rectangle rec = new Rectangle();
		double calculateArea = rec.area(20,2);
		System.out.println(calculateArea);
	}
}*/


public class Area{
	
	String name = "";
	int age = 0;
	String address = "";
	String gender = "";
	
	public static void main(String[] args){
		Area human = new Area();
		human.name = "Shabareesh";
		human.age = 22;
		human.address = "TVL";
		human.gender = "Male";
		
		System.out.println(human.name+" "+human.age+" "+human.address+" "+human.gender);
	}
}