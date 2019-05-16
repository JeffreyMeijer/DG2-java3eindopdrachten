package mysql;
import java.awt.event.*;
import javax.swing.*;
public class Programma extends JFrame{
	private static String volnaam = "";
	public static DefaultListModel<String> listModel;
	
	public static void main(String[] args) {
		Database database = new Database();
		database.startConnection();
		JFrame f = new JFrame("Personen");
		f.setVisible(true);
		f.setSize(540,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		f.add(panel);
		
		JTextField voornaam = new JTextField(20);
		voornaam.setBounds(0, 0, 200, 30);
		panel.add(voornaam);
		
		JTextField achternaam = new JTextField(20);
		achternaam.setBounds(335, 0, 200, 30);
		panel.add(achternaam);
		
		
		listModel = new DefaultListModel<>();
		
		JList<String> list = new JList<>(listModel);
		JScrollPane s = new JScrollPane(list);
		s.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		s.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		s.setBounds(150,120, 200, 100);
		panel.add(s);
		
		JButton toevoeg = new JButton("Persoon toevoegen");
		toevoeg.setBounds(150, 250, 200, 50);
		toevoeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == toevoeg) {
					volnaam += voornaam.getText() + " " + achternaam.getText();
					listModel.addElement(volnaam);
					volnaam = "";
				}
			}
		});
		panel.add(toevoeg);
		f.revalidate();
		f.setVisible(true);
		f.setResizable(false);
	}
}
