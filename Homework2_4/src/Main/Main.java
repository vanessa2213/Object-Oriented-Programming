package Main;
import homework.*;

public class Main {

	public static void main(String[] args) {
		Robot R1=new Robot("Yku","Ale",2010);
		DeliveryPlane dP= new DeliveryPlane("Alk", 2011, 25);
		DeliveryDrone dD= new DeliveryDrone("ALU", "Anda", 2014, 20.5f);
		Mailman mm= new Mailman("Jorge");
		
		System.out.println("The fastest delivery between " +mm.getName()+" and "+dP.getModel()+" is: "+ MailOffice.getFastestDelivery(mm,dP).stateYourName());
		System.out.println("The fastest delivery between " +mm.getName()+" and "+dD.getName()+" is: "+MailOffice.getFastestDelivery(mm, dD).stateYourName());
		System.out.println("The fastest delivery between " +dP.getModel()+" and "+dD.getName()+" is: "+MailOffice.getFastestDelivery(dP, dD).stateYourName());
		
		System.out.println("The newer robot between "+R1.getName()+" and "+dD.getName()+" is: "+MailOffice.getNewerRobot(R1, dD).getName());
	}

}
