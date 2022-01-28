package human;
public class Runner extends Human{
	private int numberMedals;
	
	public int getNumberMedals() {
		return numberMedals;
	}
	
	
	public void run() {
		System.out.println("RUNNERS GO FASTER.");
	}

	public Runner(float speed, float strenght, String name, int numberMedals) {
		super(speed, strenght, name);
		this.numberMedals =numberMedals;
		// TODO Auto-generated constructor stub
	}
}

