class Animal{
		String name;
		int age;
		
		void makeSound(){
			System.out.println("Animal makes a sound");
		}
	}
	
	class Dog extends Animal{
		String breed;
		
		void makeSound(){
			System.out.println("Dogs barks");
		}
		
		void fetch(){
			System.out.println("Dog is fetching");
		}
	}
	
	class Cat extends Animal{
		String color;
		
		void makeSound(){
			System.out.println("Cat meows");
		}
		
		void climb(){
			System.out.println("Cat is climbing");
		}
	}
	
public class CodeChallenge5{
	
	public static void main(String[] args){
		Dog d1 = new Dog();
		d1.name  = "Jimmy";
		d1.age = 10;
		d1.breed = "Labour";
		d1.makeSound();
		d1.fetch();
		
		Cat c1 = new Cat();
		c1.name = "Pinky";
		c1.age = 5;
		c1.color = "Black";
		c1.makeSound();
		c1.climb();
	}
}