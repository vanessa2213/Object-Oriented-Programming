package human;

public class Human {
	private float speed,strenght,distance;
	private int hours;
	private String name;
	
	
	public float getSpeed() {
		return speed;
	}
	public float getStrenght() {
		return strenght;
	}
	public String getName() {
		return name;
	}
	public Human(float speed, float strenght, String name) {
		super();
		this.speed = speed;
		this.strenght = strenght;
		this.name = name;
	}
	
	public void run() {
		System.out.println("GOTTA GO FAST");
	}
	
	public void run (float distance) {
		System.out.println("I ran "+distance+" km.");
	}
	
	public void run(int hours) {
		System.out.println("I ran for "+hours+" hours.");
	}
	
	public float getHours() {
		return hours;
	}
	public void setHours(int hours) {System.out.println("i ran "+distance+" km.");
		this.hours = hours;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	

}
