package memory;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;

public class Logica {
	private int kolommen;
	private int rijen;
	private int kaarten = 16;
	private final String COVERPATH = "memory/fotos/cover/";
	private final String CARDFRONTSPATH = "memory/fotos/card_fronts/";
	private ArrayList<ImageIcon> fotoArray;

	//Getters
	public int getKolommen() {
		return kolommen;
	}

	public int getRijen() {
		return rijen;
	}

	public ArrayList<ImageIcon> getFotoArray() {
		return fotoArray;
	}

	public String getCOVERPATH() {
		return COVERPATH;
	}
	
	public int getAantalKaarten() {
		return kaarten;
	}

	//Setters
	public void setKolommen(int kolommen) {
		this.kolommen = kolommen;
	}

	public void setRijen(int rijen) {
		this.rijen = rijen;
	}
	
	public void kaartenAftrek() {
		this.kaarten -= 2;
	}

	//maakt de foto array.
	public void setFotoArray(int rijen, int kolommen) {
		File dir = new File(CARDFRONTSPATH);  //Hier kies je een directory.
		File[] files = dir.listFiles(); //Maakt een array van de geselecteerde directory.
		int fileNumber = 0; //Hier mee pak je steeds de volgende bestand in het array.
		ArrayList<ImageIcon> fotoArray = new ArrayList<ImageIcon>(); //Arraylist waar de foto's in gaan (hier gebruik ik ImageIcon voor).
		for(int r = 0; r < rijen * kolommen / 2; r++) {
			for (int i = 0; i < 2; i++) {
				fotoArray.add(new ImageIcon("" + files[fileNumber])); //Voegt bestanden toe aan het foto array en maakt het een ImageIcon.
			}
			fileNumber++;

		}
		this.fotoArray = fotoArray;

	}

	//Shuffled de foto array.
	public void shuffleArray(ArrayList<ImageIcon> fotoArray) {
		Collections.shuffle(fotoArray);
		this.fotoArray = fotoArray;
	}



}
