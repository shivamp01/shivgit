import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.ibm.SocialMedia.*;

public class TestSocialMedia {
	public static void main(String[] args) {
		
		Dashboard db1=new Dashboard();
		User user1=new User("Shivam");
		User user2=new User("creator");
		Comment cmt1=new Comment(user1, "Awesome pic!!");
		Comment cmt2=new Comment(user2, "Thanks");
		System.out.println(cmt1.toString());
		
		Post p1=new Post(user2, "I am currently busy.Please dont call me just text me.", LocalDate.now(),db1);
		Post p2=new Post(user1, "Hii guys", LocalDate.now().minus(1,ChronoUnit.MONTHS), db1);
		p1.showPost();
		p1.likeButton(user1);
		p1.dislikeButton(user2);
		p1.showPost();
		
		p1.addComent(cmt1);
		p1.addComent(cmt2);
		p1.showPost();
		db1.display();
		cmt1.likeButton();
		cmt1.likeButton();
		cmt1.dislikeButton();
		db1.display();
	}
}
