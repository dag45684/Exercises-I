package gameSwing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class Stage  extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private Ball ball;
	
	public Stage(int width, int heigth){
		
		setPreferredSize(new Dimension(width, heigth));
		ball = new Ball (this, width/2d, heigth/2d, 150, 900, 50, Color.MAGENTA);
		
	}
	
	public void paint (Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(getBackground());
		g2.fillRect(0, 0, getWidth(), getHeight()); //borramos el frame anterior
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		ball.paint(g2);
	}
	
	public void start() {
		new Thread(this::loop).start();
	}
	
	public void loop() {
		long t0;
		long t1;
		long lapse;
		while (true) {
			t0 = System.nanoTime();
			t1 = System.nanoTime();
			lapse = t1 - t0;
			t0 = t1;
			ball.move(lapse);
			repaint();
		}
	}
	

}
