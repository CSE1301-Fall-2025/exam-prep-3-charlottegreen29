package exam.codewriting.q2;

import java.util.LinkedList;

/*
 * We now wish to create a SolarSystem class. The beginnings of this class have been
provided to you below. Examine the instructions and complete the remaining methods.
 */

public class SolarSystem {

	// Instance variables (do not change)
	private String name ;
	private LinkedList < Planet > planets ;
	// Write the constructor for the SolarSystem class.
	// When a SolarSystem is first created, it should not contain any planets.

	public SolarSystem(String name, LinkedList < Planet > planets){
		this.name = name;
		this.planets = planets;
	}
	
	public String getName () {
		return this.name;
	}
	
	public void addPlanet ( Planet p) {
		planets.add(p);
	}
	
	public int getNumberOfPlanets () {
		return planets.size();
	}
	
	/**
	* Returns the sum of the masses of all planets in the solar system
	*/
	public double getTotalMass () {
		double totalMass = 0;
		for (Planet p : planets){
			totalMass+=p.getMass();
		}
		return totalMass;
	}
	
	public static void main(String[] args) {
		//Write a line of code that creates an instance of the Planet class by calling the constructor. You should
		//also declare a variable to hold the newly created instance.
		Planet queibler = new Planet("Queibler", 1);
		
		//Write a line of code that creates an instance of the SolarSystem class by calling the constructor. You
		//should also declare a variable to hold the newly created instance.
		LinkedList <Planet> quibPlanets = new LinkedList<>();
		SolarSystem quibleria = new SolarSystem("Quibleria",quibPlanets);

		//Write a line of code that will add the Planet to the SolarSystem
		quibleria.addPlanet(queibler);
		
		//Write a line of code that will retrieve the total mass from the SolarSystem
		System.out.println(quibleria.getTotalMass());
	}
}
