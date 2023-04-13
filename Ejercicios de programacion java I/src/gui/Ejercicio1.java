package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Ejercicio1 extends JFrame implements ActionListener {

	 private static final long serialVersionUID = 1L;
	 
	 Ejercicio1(String[] args){
		 super("My app");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 Container contentPane = getContentPane();

		 pack(); //Dimensiona la ventana en base al contenido que le hayamos agregado
		 setLocationRelativeTo(null);
	 }
	 
	 public static void main(final String[] args) {
		 SwingUtilities.invokeLater(() -> new App2(args).setVisible(true));
		 
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
