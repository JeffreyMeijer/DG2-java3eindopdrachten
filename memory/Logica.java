package memory;

import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Logica {
	private int kolommen;
	private int rijen;
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
	
	//Setters
	public void setKolommen(int kolommen) {
		this.kolommen = kolommen;
	}
	
	public void setRijen(int rijen) {
		this.rijen = rijen;
	}
	/**
	 * javadoc
	 * @param fileNumber  dit is het aantal rijen van ..
	 * @param kolommen
	 */
	public void setFotoArray(int rijen, int kolommen) {
		File dir = new File("src/memory/fotos/card_fronts");
		File[] files = dir.listFiles();
		int fileNumber = 0;
		ArrayList<ImageIcon> fotoArray = new ArrayList<ImageIcon>();
		for(int r = 0; r < rijen * kolommen / 2; r++) {
			File file = files[fileNumber];
			
			for (int i = 0; i < 2; i++) {
				fotoArray.add(new ImageIcon("" + file));
			}
			fileNumber++;
		
		}
		
		for (int i = 0; i < 16; i++) {
			System.out.println(fotoArray.get(i));
		}
		this.fotoArray = fotoArray;
	
	}
	
	
}


