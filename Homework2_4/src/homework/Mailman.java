package homework;

public class Mailman implements Transporter{
	String name;

	public String getName() {
		return name;
	}

	public Mailman(String name) {
		super();
		this.name = name;
	}

	@Override
	public float calculateSpeed() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String stateYourName() {
		// TODO Auto-generated method stub
		return name;
	}
	public void deliverMail() {
		System.out.println("Delivering Mail.");
	}
	
	

}
