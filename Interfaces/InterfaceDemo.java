package Interfaces;

public class InterfaceDemo {
	
	public static void main(String[] args) {
		
		
		InterfaceDemo id = new InterfaceDemo();
		Dog dog = new Dog(4,2);
		id.makeSound(dog);
		dog.show_feat();
		Cat cat = new Cat();
		id.makeSound(cat);
		dog.setPetOrWild();
		dog.setFood();
		System.out.println(dog.food);
		
	}
	
	public void makeSound(mammal m) {
		m.sound();
	}

}


class Dog extends Animal implements mammal, PetOrWildDog{
	
	String food;
	
	Dog(int legs, int eyes) {
		super(legs, eyes);
	}

	public void sound() {
		System.out.println("Wow wow !!");
	}

	@Override
	public String setPetOrWild() {
		// TODO Auto-generated method stub
		return "Pet";
	}

	@Override
	public void setFood() {
		// TODO Auto-generated method stub
		 food = "Meat";		
		 int a [] = new int[5];
		 System.out.println(a[0]);
		// food.charAt(0);
		 a[0] += 2;
		 a[0] += 1;
		 if (a[0] == 2) a[0] = 3;
	}
	
}

class Cat implements mammal{
	
	public void sound() {
		System.out.println("Meow wow !!");
	}
	
}