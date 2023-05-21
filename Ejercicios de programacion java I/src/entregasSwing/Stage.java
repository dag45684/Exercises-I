package entregasSwing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Stage {
	Figure figure;
	private boolean pause;
	private Thread t;
	private volatile boolean running;
	private JFrame frame;
	private double width;
	private double height;
	private double floorY;
	private double scale;
	private Stroke pincel;
	private Line2D.Double floor;

	public synchronized void togglePause() {
		if (pause) {
			pause = false;
			notify();
		} else
			pause = true;
	}

	public boolean isPaused() {
		return pause;
	}

	public void start(JFrame frame) {
		this.frame = frame;
		width = 57.931f;
		scale = frame.getWidth() / width;
		pincel = new BasicStroke(3f / (float) scale);
		height = frame.getHeight() / scale;
		floorY = height / 2f;
		floor = new Line2D.Double(0, floorY, width, floorY);
		double radius = 3.579f / 2f;
		double x = width / 2f;
		double y = floorY - radius;
		figure = new Figure(this, x, y, radius, 5, 17.313f, 0, Color.CYAN);
		(t = new Thread(this::loop)).start();
	}

	public void stop() {
		running = false;
		synchronized (this) {
			if (pause) {
				pause = false;
				notify();
			}
		}
		try {
			t.join();
		} catch (InterruptedException e) {
		}
	}

	public void loop() {
		long t0;
		long t1;
		long lapse;
		t0 = System.nanoTime();
		running = true;
		while (running) {
			synchronized (this) {
				if (pause) {
					try {
						wait();
					} catch (InterruptedException e) {
					}
					if (running)
						t0 = System.nanoTime();
					else
						break;	
				}
			}
			t1 = System.nanoTime();
			lapse = t1 - t0;
			t0 = t1;
			next(lapse);
			render();
		}
	}

	private void next(long lapse) {
		figure.move(lapse);
	}

	
	private void render() {
		BufferStrategy bufferStrategy = frame.getBufferStrategy();
		Graphics2D g = null;
		try {
			g = (Graphics2D) bufferStrategy.getDrawGraphics();
			g.setColor(Color.GRAY);
			g.fillRect(0, 0, frame.getWidth(), frame.getHeight());
			g.setStroke(pincel);
			g.scale(scale, scale);
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			figure.paint(g);
			g.setColor(Color.MAGENTA);
			g.draw(floor);
		} finally {
			if (g != null)
				g.dispose();
		}
		bufferStrategy.show();
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

}
