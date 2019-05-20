package memory;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Logica {
	private int kolommen;
	private int rijen;
	private ImageIcon[][] fotoArray;
	
	//Getters
	public int getKolommen() {
		return kolommen;
	}
	
	public int getRijen() {
		return rijen;
	}
	
	public ImageIcon[][] getFotoArray() {
		return fotoArray;
	}
	
	//Setters
	public void setKolommen(int kolommen) {
		this.kolommen = kolommen;
	}
	
	public void setRijen(int rijen) {
		this.rijen = rijen;
	}
	
	public void setFotoArray(int rijen, int kolommen) {
		File dir = new File("fotos/card_fronts");
		File[] files = dir.listFiles();
		int fileNumber = 0;
		ImageIcon[][] fotos = new ImageIcon[rijen][kolommen];
		for(int r = 0; r < rijen; r++) {
			for (int i = 0; i < kolommen / 2; i++, fileNumber++) {
				File file = files[fileNumber];
				for(int k = 0; k < 2; k++) {
					fotos[r][i + k] = new ImageIcon("" + file);
					System.out.println(fotos[r][i + k]);
				}
			}
		}
		this.fotoArray = fotos;
	}
	
	
}
