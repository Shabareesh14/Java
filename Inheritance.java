//                                         //Inheritance

// class dad{
//         int money = 2000;
//         String father_name = "Raayan";
//     }
    
//     class Son extends dad{
        
//     }

// class Main {
//     public static void main(String[] args) {
//         Son obj = new Son();
//         System.out.println("Father name: "+obj.father_name);
//         System.out.println("Money: "+obj.money);
//     }
// }


										
										//Multilevel Inheritance

/*class ClassRoom{
    int tables = 10;
    int strength = 45;
}

class Tables extends ClassRoom{
    int columns = 5;
    int rows = 7;
}

class Students extends Tables{
    
}

public class Inheritance{
    public static void main(String[] args){
        Students stu = new Students();
        System.out.println("Colums: "+stu.columns);
        System.out.println("Strength: "+stu.strength);
        System.out.println("Rows: "+stu.rows);
        System.out.println("Tables: "+stu.tables);
    }
}*/

										//Hierarchy Inheritance


class Velangu{
		void eat(){
			System.out.println("The animals can eat");
		}
	}	
	
	class Dog extends Velangu{
		void barks(){
			System.out.println("The dog Barks");
		}
	}
	
	class Cat extends Velangu{
	void meow(){
		System.out.println("The cat can Meow");
	}
	}

public class Inheritance{

	public static void main(String[] args){
		Cat c1 = new Cat();
		c1.meow();
		c1.eat();
		
		Dog d1 = new Dog();
		d1.barks();
	}
}