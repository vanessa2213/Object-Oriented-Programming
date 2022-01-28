package humans;
public class Runner extends Human {
	
	int numberOfMedals;
	
	
	public int getNumberOfMedals() {
		return numberOfMedals;
	}


	public void setNumberOfMedals(int numberOfMedals) {
		this.numberOfMedals = numberOfMedals;
	}


	public Runner(float speed, float strenght, String name, int numberOfMedals) {
		super(speed, strenght, name);
		this.numberOfMedals=numberOfMedals;
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		System.out.println("Runners run fast");
	}
	
}
