import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import CaseStudy.*;

public class TestCS {
	public static void main(String[] args) {
		UserI user=UserFactory.getUser("Shivam", 23, "male", 10000);
		UserI user1=UserFactory.getUser("zubair", 17, "male", 1000);
		UserI user2=UserFactory.getUser("neha", 55, "female", 500);
		SubscriptionI sub=SubscribeFactory.getSubscription("monthly", LocalDate.now().plus(1,ChronoUnit.MONTHS));
		
		try {
			sub.subscribe(user1, "annualy");
		} catch (SubscriptionException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			sub.subscribe(user, "monthly");
		} catch (SubscriptionException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		try {
			sub.subscribe(user2, "monthly");
		} catch (SubscriptionException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		try {
			sub.subscribe(user, "annualy");
		} catch (SubscriptionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		try {
			user.mySubscription();
		} catch (SubscriptionException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1);
		}
		user.profile();
		user1.profile();
		user2.profile();
		
		Media med=MediaFactory.getMovie("Avengers","erotic",false,3.5);
		try {
			med.play(user);
		} catch (SubscriptionException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (AgeRestrictionException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		Series s1=MediaFactory.getSeries("GOT", "Mystery", true, 8, 10);
		Movie m1=MediaFactory.getMovie("Ironman","horror",true,2.5);
		
		try {
			s1.play(user1);
		} catch (SubscriptionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (AgeRestrictionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			m1.play(user2);
		} catch (SubscriptionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (AgeRestrictionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			s1.play(user,3,5);
		} catch (SubscriptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AgeRestrictionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			m1.play(user);
		} catch (SubscriptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AgeRestrictionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
