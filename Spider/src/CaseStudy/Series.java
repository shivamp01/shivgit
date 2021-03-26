package CaseStudy;

public class Series extends Media{

	private int  seasons;
	private int  episodes;
	public Series() {
		// TODO Auto-generated constructor stub
	}
	public Series(String title,String genere,Boolean free,int seasons, int episodes) {
		super(title,genere, free);
		this.seasons = seasons;
		this.episodes = episodes;
	}
	public int getSeason() {
		return seasons;
	}
	public void setSeason(int seasons) {
		this.seasons = seasons;
	}
	public int getEpisode() {
		return episodes;
	}
	public void setEpisode(int episodes) {
		this.episodes = episodes;
	}
	
	
//	@Override
//	public void play(User u) throws SubscriptionException, AgeRestrictionException {
//		//super.play(u);
//		System.out.println("Playing season 1 episode 1");
//		
//	}
	public void play(UserI user,int ses,int epi) throws SubscriptionException, AgeRestrictionException {
		User u=(User)user;
		super.play(u);
		if(ses<seasons && epi<episodes) {
			System.out.println("Playing title:"+title+"\t episode "+epi +" of season "+ses);
		}else {
			System.out.println("cannot play requested media");
		}
		
	}
}
