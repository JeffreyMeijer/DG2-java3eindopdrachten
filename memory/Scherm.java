package memory;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Scherm{
    public JFrame f;
    public JPanel p;
    public JButton foto1;
    public JButton foto2;
    public int r;
    public int k;
    public int geklikt = 0;
    public ArrayList<String> fotos = new ArrayList<String>();
    Logica logica = new Logica();
    public void createWindow(int h, int w) {
        f = new JFrame("Memory");
        p = new JPanel();
        p.setLayout(new GridLayout(4,4));
        f.setVisible(true);
        f.add(p);
        f.setSize(h,w);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public ActionListener createActionlistener() {
    	ActionListener listener = new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			if(e.getSource() instanceof JButton) { // Kijkt of ActionEvent source een JButton is
    				JButton buttonclicked = ((JButton) e.getSource()); // Pakt de image dir string
    				int height = ((JButton) e.getSource()).getHeight(); // Pakt de height van de button
    				int width = ((JButton) e.getSource()).getWidth(); // Pakt de width van de button
    				Image foto = new ImageIcon(buttonclicked.getText()).getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH); // Zet Foto height en width naar button height en width
    				ImageIcon iconfoto = new ImageIcon(foto); // Maakt van Image een ImageIcon (Zodat je de icon voor de button kan zetten)
    				//Checkt hoevaak er al geklikt is
    				if(geklikt == 0) {
        				fotos.add(buttonclicked.getText());
        				foto1 = buttonclicked;
        				foto1.setIcon(iconfoto);
        				geklikt++;
    				}
    				else if(geklikt == 1) {
    					fotos.add(buttonclicked.getText());
    					foto2 = buttonclicked;
    					foto2.setIcon(iconfoto);
    					
    					//Als de fotos hetzelfde zijn, clear de array en zet geklikt terug naar 0
        				if(fotos.get(0).equals(fotos.get(1))) {
        					fotos.clear();
        					geklikt = 0;

        					//Als de fotos niet hetzelfde zijn, wacht 2 seconden en zet dan de foto terug naar cover.jpg
        				}else {
        					new java.util.Timer().schedule( 
        					        new java.util.TimerTask() {
        					            @Override
        					            public void run() {
        					            	foto1.setIcon(new ImageIcon("src/memory/fotos/cover/cover.jpg"));
        	        						foto2.setIcon(new ImageIcon("src/memory/fotos/cover/cover.jpg"));
        					            }
        					        },
        					        500
        					);
        					fotos.clear();
        					geklikt = 0;
        				}
        			}
    			}
    		}
    };
    return listener;
   }

    //Maakt buttons
    public void createButtons(int rijen, int kolommen, ArrayList<ImageIcon> fotoarray, int h, int w) {
        int counter = 0;
    	JButton[][] buttons = new JButton[rijen][kolommen];
        for(r = 0; r < rijen; r++) {
            for(k = 0; k < kolommen; k++) {
                buttons[r][k] = new JButton(new ImageIcon("src/memory/fotos/cover/cover.jpg"));
                buttons[r][k].addActionListener(createActionlistener());
                buttons[r][k].setText(fotoarray.get(counter).toString());
                p.add(buttons[r][k]);
                counter++;
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
