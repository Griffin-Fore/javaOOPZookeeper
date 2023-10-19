package zooKeeper;

public class Bat extends Mammal {
	
	public Bat() {
		this.energy = 300;
	}
	
	public String fly() {
		this.energy  -= 50;
		System.out.println("The Bat flu");
		return "The bat is flying. Energy: " + this.energy;
	}
	
	public String eatHumans() {
		this.energy += 25;
		System.out.println("The bat 8");
		return "The bat just ate somebodies" + this.energy;
	}
	
	public String attackTown() {
		this.energy -= 100;
		System.out.println("bat time");
		return "The bat came out of nowhere and killt errybody!";
	}
}
