package CaseStudy;

public final class UserFactory {
	
	private UserFactory() {
		
	}
	public static User getUser(String name, int age, String gender, double balance) {
		return new User(name,age,gender,balance);
	}
}
