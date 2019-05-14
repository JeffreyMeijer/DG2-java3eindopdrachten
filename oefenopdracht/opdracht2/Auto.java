package opdracht2;

public class Auto extends Vervoermiddel{
	private int gewicht;
	private double belasting;
	
	@Override
	public int getAantalwielen() {return 4;}
	
	public double getBelasting() { return belasting; }
	public void setBelasting(double belasting) { this.belasting = belasting; }
	
	public int getGewicht() { return gewicht; }
	public void SetGewicht(int gewicht) { this.gewicht = gewicht; }
}
