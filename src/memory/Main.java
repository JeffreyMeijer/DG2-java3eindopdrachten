package memory;

public class Main {

    public static void main(String[] args) {
        Logica logica = new Logica();
        Scherm scherm = new Scherm();
        scherm.createWindow(1280, 720);
        logica.setRijen(4);
        logica.setKolommen(4);
        logica.setFotoArray(logica.getRijen(), logica.getKolommen());
        logica.shuffleArray(logica.getFotoArray());
        scherm.createButtons(logica.getRijen(), logica.getKolommen(), logica.getFotoArray(),1280, 720);
    }

}