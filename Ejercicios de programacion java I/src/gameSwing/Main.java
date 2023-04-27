package gameSwing;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main  extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private Stage stage;

	Main(String[] args) {
		super("MyGame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(stage = new Stage(400, 700));
		pack();
		setLocationRelativeTo(null);
	}
	
	private void startLoop() {
		setVisible(true);
		stage.start();
	}
	
	public static void main(final String[] args) {
		SwingUtilities.invokeLater(() -> new Main(args).startLoop());
	}


}
