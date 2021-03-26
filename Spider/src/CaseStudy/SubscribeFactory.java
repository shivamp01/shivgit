package CaseStudy;

import java.time.LocalDate;

public final class SubscribeFactory {
	
	public SubscribeFactory() {
		// TODO Auto-generated constructor stub
	}
	public static Subscription getSubscription(String plan, LocalDate expiry) {
		return new Subscription(plan,expiry);
	}

}
