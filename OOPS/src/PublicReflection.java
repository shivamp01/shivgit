import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PublicReflection {
	public static void main(String[] args) throws ClassNotFoundException {
		//Person p=new Person("Polo",21);
		//Class pc=p.getClass();
		
		Class pc=Class.forName("Person");
		
		System.out.println(pc.getName());
		
		Constructor[] cons=pc.getConstructors();
		System.out.println("List of Constructors");
		for(Constructor con:cons) {
			System.out.println(con);
		}
		
		Method[] met=pc.getMethods();
		int cnt=0;
		for(Method me:met) {
			System.out.println(me);
			cnt++;
		}
		System.out.println(cnt);
		
		Method[] met1=pc.getDeclaredMethods();
		int cnt1=0;
		for(Method me:met1) {
			System.out.println(me);
			cnt1++;
		}
		System.out.println(cnt1);
		
		Field[] field=pc.getDeclaredFields();
		for(Field f:field) {
			System.out.println(f);
		}
	}

}
