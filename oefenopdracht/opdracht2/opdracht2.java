package opdracht2;

public class opdracht2 {

	public static void main(String[] args) {
		Auto auto = new Auto();
		
		auto.setMerk("BMW");
		auto.setType("I8");
		auto.setKleur("Metallic blauw");
		
		auto.SetGewicht(2000);
		auto.setBelasting(435.45);
		
		System.out.println("De wegenbelasting is: " + auto.getBelasting()+ " euro per maand");
	}

}
