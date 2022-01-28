package homework;

public class DeliveryPlane implements Transporter{
	
	String model;
	int year;
	float maximumSpeed;
	
	
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public float getMaximumSpeed() {
		return maximumSpeed;
	}
	public DeliveryPlane(String model, int year, float maximumSpeed) {
		super();
		this.model = model;
		this.year = year;
		this.maximumSpeed = maximumSpeed;
	}
	@Override
	public float calculateSpeed() {
		// TODO Auto-generated method stub
		return (float) (maximumSpeed*.08);
	}
	@Override
	public String stateYourName() {
		// TODO Auto-generated method stub
		return model;
	}
	
	

}
