package opdracht1;


public class opdracht1 {
	public static void main(String[] args) {
		Persoon jeffrey = new Persoon();
		jeffrey.setVoornaam("Jeffrey");
		jeffrey.setAchternaam("Meijer");
		jeffrey.setGeboortedatum("2002-03-08");
		System.out.println(jeffrey.calculateDays(jeffrey.getGeboortedatum()));
	}

}
