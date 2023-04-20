package gui;

import java.awt.BorderLayout;
import java.awt.Canvas;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainCanvas extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public MainCanvas() {
		super("Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new Drawings(), BorderLayout.CENTER);
		
		pack();
		setLocationRelativeTo(null);
	}
	
	public static void main (String[] args) {
		SwingUtilities.invokeLater(() -> new MainCanvas().setVisible(true));
	}

}
