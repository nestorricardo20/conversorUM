package oneConversor;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class ConversorGrafico extends JFrame {
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcion1;
	private JMenuItem opcion2;
	private JMenuItem opcion3;
	
	public ConversorGrafico() {
		setSize(600,400);
		setTitle("Conversor One");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		mostrarMenu();
		panel.add(menuBar);
		add(panel);		
	}
	public void mostrarMenu() {
		menuBar= new JMenuBar();
		menu= new JMenu("Elija una opcion valida :");
		opcion1 =new JMenuItem("CM -> metros");
		opcion2 =new JMenuItem("metros -> cm");
		opcion3 =new JMenuItem("Salir");
		
		menu.add(opcion1);
		menu.add(opcion2);
		menu.add(opcion3);
		
		menuBar.add(menu);
		
		opcion3.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Que pensa Saliendo");
				System.exit(00);				
			}
		});
		
		opcion1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Ingresar Centímetros para convertir a Metros :");
				Double resultado= Double.parseDouble(name) * 0.01;
				JOptionPane.showMessageDialog(null, "Su resultado es " + resultado +" Metros");				
			}
		});
		opcion2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Ingresar los metros para convertir a Centímetros:");
				Double resultado= Double.parseDouble(name) * 100;
				JOptionPane.showMessageDialog(null, "Su resultado es " + resultado +" Metros");				
			}
		});
		
	}
	
	
	
	

	public static void main(String[] args) {
		ConversorGrafico ventana= new ConversorGrafico();
		ventana.setVisible(true);
		// TODO Auto-generated method stub

	}

}
