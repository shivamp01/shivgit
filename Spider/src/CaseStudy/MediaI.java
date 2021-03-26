package CaseStudy;

public interface MediaI {
	public void free(Boolean b);
	public void play(UserI user) throws SubscriptionException, AgeRestrictionException;
}
