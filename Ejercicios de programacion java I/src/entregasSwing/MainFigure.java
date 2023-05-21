package entregasSwing;

import java.awt.BufferCapabilities;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainFigure extends JFrame implements KeyListener, WindowListener {

	private Stage stage = new Stage();

	MainFigure(String[] args) {
		super("MyApp");
		addKeyListener(this);
		addWindowListener(this);
		setIgnoreRepaint(true);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		showBufferCapabilities();
	}
	
	private void showBufferCapabilities() {
		for (GraphicsDevice device: GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()) {
				BufferCapabilities bc = device.getDefaultConfiguration().getBufferCapabilities();
				System.out.println(device.getDefaultConfiguration().toString());
				System.out.println("\tPage Flipping: " + bc.isPageFlipping());
				System.out.println("\tFull Screen Required: " + bc.isFullScreenRequired());
				System.out.println("\tMultiBuffer: " + bc.isMultiBufferAvailable());
			}
	}

	private void start() {
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice[] devices = ge.getScreenDevices();
		GraphicsDevice device = devices.length == 2 ? devices[1] : ge.getDefaultScreenDevice();
		device.setFullScreenWindow(this);
		createBufferStrategy(2);
		stage.start(this);
	}

	public static void main(final String[] args) throws IOException {
		SwingUtilities.invokeLater(() -> new MainFigure(args).start());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_P:
			stage.togglePause();
			break;
		case KeyEvent.VK_ESCAPE:
			stage.stop();
			dispose();
			System.exit(0);
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}