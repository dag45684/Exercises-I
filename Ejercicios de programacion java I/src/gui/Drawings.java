package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Drawings extends JPanel{

	private static final long serialVersionUID = 1L;

	
	public Drawings () {
		super (new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0;
		constraints.gridy = 0;
		setPreferredSize(new Dimension(700, 700));
		setBackground(new Color(250, 20, 150));
		JButton button = new JButton("Sexo");
		add(button, constraints);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.CYAN);
		g.drawLine(0, 0, getWidth(), getHeight());
	}
	

}
