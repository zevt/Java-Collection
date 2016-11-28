package comparing;

public class Squirrel {
	private int weight;
	private String species;
	
	public Squirrel(int weight, String species) {
	super();
	this.weight = weight;
	this.species = species;
	
	}
	
	public String getSpecies() {
		return species;
	}


	public int getWeight() {
		return weight;
	}

	
	public String toString() {
		return species + "  " + weight;
	}
}
