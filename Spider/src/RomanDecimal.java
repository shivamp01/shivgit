
public class RomanDecimal {
	public static String bvalue(int ind) {
		String[] base= {"i","iv","v","ix","x","xl","l","xc","c","cd","d"};
		
		return base[ind];
	}
	public static void main(String[] args) {
		int[] dec=new int[] {1,4,5,9,10,40,50,90,100,400,500};
		
		
		int num=37;
		int num1=num;
		int rem=-1;
		int q;
		String out="";
		while(rem!=0) {
			for(int i=0;i<dec.length;i++) {
				if(num<dec[i]) {
					String bv=bvalue(i-1);
					q=num/dec[i-1];
					rem=num%dec[i-1];
					for(int j=0;j<q;j++) {
						out+=bv;
					}
					num=rem;
					//System.out.println(bv+"  "+q+"  "+rem+"   "+out);
					break;
				}
				else if(num==dec[i]) {
					String bv=bvalue(i);
					q=num/dec[i];
					rem=num%dec[i];
					for(int j=0;j<q;j++) {
						out+=bv;
					}
					num=rem;
					//System.out.println(bv+"  "+q+"  "+rem+"   "+out);
					break;
				}
			}
		}
		System.out.println("Roman representation of Number "+num1+" is :"+out);
	}
}
