package CaseStudy;

public class User implements UserI{
	private String name;
	private int age;
	private String gender;
	private double balance;
	private Subscription subscription;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, int age, String gender, double balance) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	
	public void profile() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Gender :"+gender);
		System.out.println("Balance :"+balance);
	}
	
	public void mySubscription() throws SubscriptionException {
		if(subscription!=null) {
		System.out.println("Subscription details are:");
		System.out.println("Yoyr Subscription plan is : "+subscription.getPlan());
		System.out.println("Your subscription will expire on : "+subscription.getExpiry());
		}else {
			throw new SubscriptionException("You have not subscribed yet");
		}
		
	}

}
