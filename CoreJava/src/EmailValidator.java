import java.util.regex.Pattern;
// there should be only 1 @ and .
//min 4 chars before @
//min 3 bet @ and .
//min 2 chars after .
public class EmailValidator {
	public static void main(String[] args) {
		
		String email="zubair@mail.com";
		String str="[a-z0-9][a-z0-9][a-z0-9][a-z0-9]+@[a-z0-9][a-z0-9][a-z0-9]+.[a-z0-9][a-z0-9]+";
		if(email.matches(str)&&(email.indexOf("@")==email.lastIndexOf("@"))&&(email.indexOf("@")==email.lastIndexOf("@"))) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}	
		
	/*
	 * String email="zubair@mail.com";
		int iat=email.indexOf("@");
		int idot=email.indexOf(".");
		if(iat==iat.lastIndexOf("@")&&idot=email.indexOf(".")&&iat>3&&idot>iat+3&&email.length()>idot+2){
			System.out.println("valid")
		}
		else{
			System.out.println("invalid")
		}
	 */
	}
}
