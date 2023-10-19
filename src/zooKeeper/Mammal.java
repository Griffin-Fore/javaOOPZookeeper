package zooKeeper;

public class Mammal {
	
	protected int energy;
	
	public Mammal() {
		this.energy = 100;
	}
	
	public String displayEnergy() {
		System.out.println("Energy" + this.energy);
		return "Energy: " + this.energy;
	}
}
