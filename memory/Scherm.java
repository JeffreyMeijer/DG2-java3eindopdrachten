package memory;
 
import java.awt.GridLayout;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Scherm extends JFrame {
<<<<<<< HEAD
	public JFrame f;
	public JPanel p;
	public void createWindow(int h, int w) {
		f = new JFrame("Memory");
		p = new JPanel();
		p.setLayout(new GridLayout(4,4));
		f.setVisible(true);
		f.add(p);
		f.setSize(h,w);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//Maakt buttons
	public void createButtons(int rijen, int kolommen, int h, int w) {
		JButton[][] buttons = new JButton[rijen][kolommen];
		for(int r = 0; r < rijen; r++) {
			for(int k = 0; k < kolommen; k++) {
				buttons[r][k] = new JButton(new ImageIcon("src/memory/fotos/cover/cover.jpg"));
				p.add(buttons[r][k]);
			}
		}
		f.setSize(h,w + 1);
		f.setSize(h,w);
		
	}
	
}
=======
    public JFrame f;
    public JPanel p;
    public void createWindow(int h, int w) {
        f = new JFrame("Memory");
        p = new JPanel();
        p.setLayout(new GridLayout(4,4));
        f.setVisible(true);
        f.add(p);
        f.setSize(h,w);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    //Maakt buttons
    public void createButtons(int rijen, int kolommen, int h, int w) {
        JButton[][] buttons = new JButton[rijen][kolommen];
        for(int r = 0; r < rijen; r++) {
            for(int k = 0; k < kolommen; k++) {
                buttons[r][k] = new JButton(new ImageIcon("src/memory/fotos/cover/cover.jpg"));
                p.add(buttons[r][k]);
                //Checkt of de button een parent heeft (in dit geval of hij in een panel zit, zo niet sluit hij de programma)
                if(buttons[r][k].getParent() == null) {
                	f.dispose();
                	System.exit(0);
                }
            }
        }
        f.setSize(h,w + 1);
        f.setSize(h,w);
       
    }
    
}
>>>>>>> 14d7b052e5463fad245520ecfca61dc3608031ca
