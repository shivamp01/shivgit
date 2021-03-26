package CaseStudy;

public class Media {
	
	protected String title;
	protected String genere;
	private Boolean free;
	
	public Media() {
		// TODO Auto-generated constructor stub
	}
	public Media(String title, String genere,Boolean free) {
		this.title = title;
		this.genere = genere;
		this.free=free;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}

	
	public void free(Boolean b) {
		
	}
	public void play(UserI user) throws SubscriptionException, AgeRestrictionException {
		User u=(User)user;
		if(!free && u.getSubscription()==null) {
			throw new SubscriptionException("You are not allowed to watch "+title);
		}else if(genere.equals("erotic")&& u.getAge()<18 ||genere.equals("horror")&& u.getAge()>=50) {
			throw new AgeRestrictionException("Your are not eligible to watch ");
		}
	}
	
	

}
