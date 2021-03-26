
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodingDemo {
	
	public static void main(String[] args) {
		String password="Shivam@123";
		System.out.println(password);
		
		Encoder encoder=Base64.getEncoder();
		String encpass=encoder.encodeToString(password.getBytes());
		System.out.println(encpass);
		
		Decoder decoder=Base64.getDecoder();
		String pass=new String(decoder.decode(encpass.getBytes()));
		System.out.println(pass);
		
	}

}
