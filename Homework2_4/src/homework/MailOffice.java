package homework;

public class MailOffice {
	
	public static Transporter getFastestDelivery(Transporter T1, Transporter T2) {
		if (T1.calculateSpeed()>T2.calculateSpeed())
			return T1;
		return T2;
	}
	public static Robot getNewerRobot(Robot R1, Robot R2) {
		if (R1.getYear() > R2.getYear())
			return R1;
		return R2;
	}
}
