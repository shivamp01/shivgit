import com.ibm.lib.Book;
import com.ibm.lib.LibraryException;
import com.ibm.lib.Member;

public class TestLibrary {
	public static void main(String[] args) {
		Book bk=new Book(1234, "Alchemist");
		Member mbr=new Member(99, "polo");
		Member mbr1=new Member(100, "demo");
		Book bk1=new Book(111, "3 idiots");
		
	//	Book b2=new Book(1253,"pqr");
		
		try {
			bk.issueBook(mbr);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
			bk1.issueBook(mbr1);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
			bk.returnBook(mbr1);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
			bk1.status();
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
			mbr1.status();
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
			bk.status();
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
			mbr.status();
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());		//also we can use e.printstackTrace();
		}
	
	}

}
