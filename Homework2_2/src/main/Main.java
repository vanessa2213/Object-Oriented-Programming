package main;

import olympic.OlympicCompetition;
import humans.*;

public class Main {

	public static void main(String[] args) {
		Human Santi= new Human(12,15,"Santiago");
		Runner Lalo= new Runner(20,22,"Eduardo",3);
		
		System.out.println("Name: "+Santi.getName());
		System.out.println("Speed: "+Santi.getSpeed());
		System.out.println("Strenght: " +Santi.getStrenght());
		Santi.run();
		Santi.run(Santi.getSpeed());
		Santi.run(Santi.getName());
		
		System.out.println("Name: "+Lalo.getName());
		System.out.println("Speed: "+Lalo.getSpeed());
		System.out.println("Strenght: " +Lalo.getStrenght());
		System.out.println("Number of Medals: " +Lalo.getNumberOfMedals());
		Lalo.run();
		Lalo.run(Lalo.getSpeed());
		Lalo.run(Lalo.getName());
		
		System.out.println("In an olympic competition "+OlympicCompetition.trackEvent(Santi, Lalo).getName()+" will win.");
		
	}

}
