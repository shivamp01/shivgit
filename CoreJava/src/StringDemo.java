
public class StringDemo {
public static void main(String[] args) {
	String s1="hello";
	String s2=new String("Hello");
	String s3="hello";
	
	//here we are comparing not the content but the address
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	
	s1=s1+"world";	//new location is assigned to modified string
	System.out.println(s1);
	System.out.println(s1.indexOf('o'));
	System.out.println(s1.lastIndexOf('o'));
	System.out.println(s1.charAt(5));
	System.out.println(s1.substring(3));
	System.out.println(s1.substring(3, 7));
	System.out.println(s1.replace('o', 'a'));
	System.out.println(s1);
	
	String week="Mon-Tue-Wed-Thurs-Fri-Sat-Sun";
	String[] arr=week.split("-");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	for(String s:arr) {
		System.out.println(s);
	}
	
}
}

