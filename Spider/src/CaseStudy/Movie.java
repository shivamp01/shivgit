package CaseStudy;

public class Movie extends Media{
	private double duration;
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	public Movie(String title, String genere, Boolean free,double duration) {
		super(title,genere,free);
		this.duration = duration;
	}
	@Override
	public void play(UserI use) throws SubscriptionException, AgeRestrictionException {
		User user=(User)use;
		super.play(user);
		System.out.println("Playing movie :"+title);
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	
}
