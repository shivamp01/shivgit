
public class ArrayDemo {
public static void main(String[] args) {
	int[] arr= {10,20,30,40,50};	//simple array
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	
	
	
	int[][] jag= {{1,2},{3,4,5},{6,7,8,9}};		//jagged array-modified two dimensional array
	for(int[] row:jag) {
		System.out.println();
		for(int j:row) {
			System.out.print(j+"\t");
		}
	}
	
}
}
