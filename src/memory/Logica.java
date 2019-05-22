package memory;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;

public class Logica {
	private int kolommen;
	private int rijen;
	private int kaarten = 16;
	private final String COVERPATH = "src/memory/fotos/cover/";
	private final String CARDFRONTSPATH = "src/memory/fotos/card_fronts/";
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

	/**
	 * javadoc
	 * @param fileNumber  dit is het aantal rijen van ..
	 * @param kolommen
	 */
	public void setFotoArray(int rijen, int kolommen) {
		File dir = new File(CARDFRONTSPATH);
		File[] files = dir.listFiles();
		int fileNumber = 0;
		ArrayList<ImageIcon> fotoArray = new ArrayList<ImageIcon>();
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
