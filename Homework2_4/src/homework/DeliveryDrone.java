package homework;

public class DeliveryDrone extends Robot implements Transporter{
	
	float speed;

	public float getSpeed() {
		return speed;
	}

	public DeliveryDrone(String model, String name, int year, float speed) {
		super(model, name, year);
		this.speed = speed;
	}

	public float calculateSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

	@Override
	public String stateYourName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
}
