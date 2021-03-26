
public class Car {
	private String model;
	private String[] features;
	
	public Car(String model, String... features) {				//varargs->can only be last parameter in method
		
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Features of  "+model);
		for (String f : features) {
			System.out.println(">  "+f);
		}
	}
	
	public static void main(String[] args) {
		//String[] falto= {"keyless","AC","power staring"};
		//String[] fhec= {"abs","moonroof","cruise control","airbags","ai"};
 		Car alto=new Car("Maruti alto", "keyless","AC","power staring");
		Car hector=new Car("Hector", "abs","moonroof","cruise control","airbags","ai");
		
		alto.specs();
		hector.specs();
	}
}
