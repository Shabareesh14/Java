public class Phones{
	String brand = "";
	String color = "";
	int price = 0;
	int ram =0;
	
	public static void main(String[] args){
		
		Phones p1 = new Phones();
		p1.brand = "Samsung";
		p1.color = "Black";
		p1.price = 20000;
		p1.ram = 8;
		
		System.out.println(p1.brand+" "+p1.color);
		
		Phones p2 = new Phones();
		p2.brand = "Nokia";
		p2.color = "SkyBlue";
		p2.price = 45000;
		p2.ram = 12;
		
		System.out.println(p2.price+" "+p2.ram);
	}
}