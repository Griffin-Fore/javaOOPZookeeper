package zooKeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		
	}
	
	public String throwSomething() {
		this.energy -= 5;
		System.out.println("The Gorilla through");
		return "Gorilla has thrown something. Energy: " + this.energy;
	}
	
	public String eatBananas() {
		this.energy += 10;
		System.out.println("The gorilla 8");
		return "Gorilla has eaten bananas. Energry: " + this.energy;
	}
	
	public String climb() {
		this.energy -= 10;
		System.out.println("The gorilla clamb");
		return "Gorilla has climbed a tree. Energy: " + this.energy;
	}
}
