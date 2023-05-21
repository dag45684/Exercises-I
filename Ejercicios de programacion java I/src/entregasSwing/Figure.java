package entregasSwing;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;

public class Figure extends Path2D.Double {

	private static final double SEC = 1000000000d;
	Stage stage;
	Color color;
	Ellipse2D.Double circle;
	double x;
	double y;
	double vx;
	double vy;
	double diameter;
	double radius;
	double angularSpeed;
	double alpha;
	double dir = 1;
	double n;
	
	public Figure(Stage stage, double x, double y, double radius, int n, double speed, double dir, Color color) {
		this.stage = stage;
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.n = n;
		this.diameter = 2 * radius;
		circle = new Ellipse2D.Double(-radius, -radius, radius*2, radius*2);
		
		// calcular velocidades
		vx = speed * Math.cos(dir);
		vy = speed * Math.sin(dir);
		angularSpeed = speed / radius;
		
		this.color = color;
		createFigure();
	}
	
	private void createFigure() {
		double b = 2 * Math.PI / n;
		moveTo(radius * Math.cos(alpha), radius * Math.sin(alpha));
		for (int i=1; i<=n; i++) lineTo(radius * Math.cos(alpha + i * b), radius * Math.sin(alpha + i * b));
		this.append(circle, false);
	}
	
	public void move(long lapse) {
		alpha += lapse * angularSpeed / SEC * dir;
		x += (float) lapse * vx / SEC;
		if (vx > 0) {
			double d = x + radius - stage.getWidth();
			if (d >= 0) {
				vx = -vx;
				dir = -dir;
				x -= 2 * d;
			}
		}
		else {
			if (x < radius) {
				vx = -vx;
				dir = -dir;
				x += 2 * (radius - x);
			}
		}
		y += (float) lapse * vy / SEC;
		if (vy > 0) {
			double d = y + radius - stage.getHeight();
			if (d >= 0) {
				vy = -vy;
				y -= 2 * d;
			}
		}
		else {
			if (y < radius) {
				vy = -vy;
				y += 2 * (radius - y);
			}
		}
	}
	
	public void paint(Graphics2D g) {
		AffineTransform af = g.getTransform();
		g.rotate(alpha, x, y);
		g.translate(x, y);
		g.setColor(color);
		g.draw(this);
		g.setTransform(af);
	}
	
	public void incSides() {
		if (n < 20) {
			n++;
			reset();
			createFigure();
		}
	}
	
	public void decSides() {
		if (n > 3) {
			n--;
			reset();
			createFigure();
		}
	}
}
