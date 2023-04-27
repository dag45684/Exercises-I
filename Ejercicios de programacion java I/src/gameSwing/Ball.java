package gameSwing;

import java.awt.Color;
import java.awt.Graphics2D;

public class Ball {
	
	private static final double SEC = 1000000000d;
	
	Stage stage;
	
	double x;
	double y;
	int diameter;
	Color color;
	double vx; //Speed component x
	double vy; //Speed component y

	Ball(Stage stage, double x, double y, int radius, double speed, double direction, Color color){
		this.stage = stage;
		this.x = x = radius;
		this.y = y = radius;
		diameter = radius * 2;
		vx = speed * Math.cos(direction);
		vy = speed * Math.sin(direction);
		this.color = color;
	}
	
	public void move(long lapse) {
		x += lapse * vx / SEC;
		if (vx > 0) {
			double d = x + diameter - stage.getWidth(); //distance to border. Negatives means its not touching it.
			if (d >= 0) { //here it bounces
				vx = vx * -1;
				x -= d;
			}
		} else {
			if (x < 0) {
				vx = vx * -1;
				x = x * -1;
			}
		}
		y += lapse * vy / SEC;
		if (vy > 0) {
			double d = y + diameter - stage.getHeight(); //distance to border. Negatives means its not touching it.
			if (d >= 0) { //here it bounces
				vy = vy * -1;
				y -= d;
			}
		} else {
			if (y < 0) {
				vy = vy * -1;
				y = y * -1;
			}
		}

	}
	
	public void paint (Graphics2D g) {
		g.setColor(color);
		g.fillOval((int) x, (int) y, diameter, diameter);
	}
	
}
