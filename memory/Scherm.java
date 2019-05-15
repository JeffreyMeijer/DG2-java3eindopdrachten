package memory;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Scherm extends JFrame{
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
	public void createButtons(int rijen,int kolommen) {
		JButton[][] buttons = new JButton[rijen][kolommen];
		for(int i=0;i < rijen;i++) {
			for(int j = 0; j < kolommen; j++) {
				buttons[i][j] = new JButton("Test");
				p.add(buttons[i][j]);
			}
		}
	}
}
