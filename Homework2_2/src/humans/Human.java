package humans;

public class Human {
	float speed, strenght;
	String name;
	
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
	
	public void run(String name) {
		System.out.println(name+" is running.");
	}
	
	public void run(float speed) {
		System.out.println("I ran at speed of "+speed);
	}
	

}
