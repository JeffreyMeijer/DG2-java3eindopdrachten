package memory;

public class Main {

	public static void main(String[] args) {
		Logica logica = new Logica();
		Scherm scherm = new Scherm();
		scherm.createWindow(1280, 720);
		logica.setKolommen(4);
		logica.setRijen(4);
		scherm.createButtons(logica.getRijen(), logica.getKolommen(), 1280, 720);
		logica.setFotoArray(logica.getRijen(), logica.getKolommen());
	}

}
