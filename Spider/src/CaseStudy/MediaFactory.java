package CaseStudy;

public class MediaFactory {
	private MediaFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static Movie getMovie(String title, String genere, Boolean free,double duration) {
		return new Movie(title,genere,free,duration);
	}
	
	public static Series getSeries(String title,String genere,Boolean free,int seasons, int episodes) {
		return new Series(title,genere,free,seasons,episodes);
	}
}
