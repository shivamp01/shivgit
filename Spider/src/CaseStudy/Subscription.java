package CaseStudy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public  class Subscription implements SubscriptionI {
	private String plan;
	private LocalDate expiry;
	
	public static final double MONTHLY=100;
	public static final double ANNUALY=1000;
	public Subscription() {
		// TODO Auto-generated constructor stub
	}
	public Subscription(String plan, LocalDate expiry) {
		super();
		this.plan = plan;
		this.expiry = expiry;
	}
	
	public void subscribe(UserI user,String pln) throws SubscriptionException {
		User u=(User)user;
		if(u.getSubscription()==null) {
		if(pln.equalsIgnoreCase("monthly") && u.getBalance()>=MONTHLY) {
			u.setSubscription(this);
			this.expiry=LocalDate.now().plus(1,ChronoUnit.MONTHS);
			u.setBalance(u.getBalance()-MONTHLY);
			this.plan=pln;
		}
		else if(pln.equalsIgnoreCase("annualy") && u.getBalance()>=ANNUALY) {
			u.setSubscription(this);
			this.expiry=LocalDate.now().plus(1,ChronoUnit.YEARS);
			u.setBalance(u.getBalance()-ANNUALY);
			this.plan=pln;
			
		}else {
			throw new SubscriptionException("Insufficient balance to subscribe");
		}}else {
			System.out.println("User is already subscribed with some plane");
		}
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public LocalDate getExpiry() {
		return expiry;
	}
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}
	

}
