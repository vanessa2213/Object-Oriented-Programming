package olympic;

import humans.Human;

public class OlympicCompetition {
	
	public static Human trackEvent(Human h1, Human h2) {
		if (h1.getSpeed()> h2.getSpeed())
			return h1;
		return h2;
	}
	
}
