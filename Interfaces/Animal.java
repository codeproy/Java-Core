package Interfaces;

public class Animal {
	
	int legs;
	int eyes;
	
	Animal(int legs, int eyes){
		this.legs = legs;
		this.eyes = eyes;
	}
	
	
	public void show_feat() {
		
		System.out.println("Legs are " + legs + " Eyes are " + eyes);
	}

}
