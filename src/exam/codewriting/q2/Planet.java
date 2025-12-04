package exam.codewriting.q2;

/*
 * We wish to create a Planet class. A planet has-a(n):
		name
		mass
 */
public class Planet {
	private String name;
	private int mass;

	// Define your instance variables here
	
	// Write the constructor for the Planet class

	public Planet(String name, int mass){ // !!! Note !!! You make the constructors public
		this.name = name;
		this.mass = mass;
	}
	
	public String getName () {
		return name;
	}
	
	public int getMass () {
		return mass;
	}
	
	public String toString () {
		String output = this.name;
		output += ": " + this.mass;
		return output;
	}
	
	/**
	* When two planets collide, a new Planet should be created and returned.
	* The mass of the new planet should be the total mass of the two planets
	* involved in the collision, and it should be named after both planets.
	*/
	public Planet collide ( Planet other ) {
		String combinedName = this.name + "-" + other.name;
		int combinedMass = this.mass + other.getMass();
		Planet combinedPlanet = new Planet (combinedName, combinedMass);
		return combinedPlanet;
	}
	
	
}
