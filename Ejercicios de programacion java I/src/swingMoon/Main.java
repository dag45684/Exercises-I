package swingMoon;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Main extends JFrame{
	
	private static final long serialVersionUID = 1L;

	private int speed = 0;
	private Moon moon = new Moon();
	private Timer timer; 
	private String[] difficulties = {"Easy", "Medium", "Hard", "Funny"};
	private JButton control;
	
	Main(String[] args){
//		Initial setup config
		super("MyApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Creating the content and passing the necessary moon element to play
		Container content = getContentPane();
		content.setBackground(Color.BLACK);
		add(moon, BorderLayout.CENTER);
		
//		Setting the JPannel
		JPanel panel = new JPanel(new FlowLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		panel.setOpaque(false);
		
//		Adding necessary buttons to the Panel
		JButton button = new JButton(new ImageIcon(getClass().getResource("/Previous.png")));
		button.addActionListener(e -> moon.previous());
		panel.add(button);
		button = new JButton(new ImageIcon(getClass().getResource("/Next.png")));
		button.addActionListener(e -> moon.next());
		panel.add(button);
		control = new JButton("PLAY");
		control.addActionListener(e -> rotate(e));
		panel.add(control);
		
//		Adding the panel with the specified controls
		add(panel, BorderLayout.SOUTH);
		
//		Creating the difficulty settings
		JComboBox<String> diffs = new JComboBox<>(difficulties);
		diffs.addActionListener(e -> selectDiff(diffs.getSelectedIndex()));
		panel.add(diffs);
		
//		Wrapping toghether
		pack();
		setLocationRelativeTo(null);
	}
	
	public void rotate(ActionEvent e) {
		if (timer.isRunning()) {
			control.setText("PLAY");
			timer.stop();
		} else {
			rndGame();
			control.setText("STOP");
			timer.start();
		}
	}
	
	public void rndGame() {
		int rnd = (int) (Math.random() * 7);
		String msg = "Stop on: " + Moon.getPhases()[rnd];
		//get to implement this!!
	}
	
	public void selectDiff (int diff) {
		switch (diff) {
		case 0:
			timer = new Timer(200, (e) -> moon.next());
			break;
		case 1:
			timer = new Timer(90, (e) -> moon.next());
			break;
		case 2:
			timer = new Timer(30, (e) -> moon.next());
			break;
		case 3:
			timer = new Timer(5, (e) -> moon.next());
			break;
		}
	}
	
	public static void main(final String[] args) {
		SwingUtilities.invokeLater(() -> new Main(args).setVisible(true));
	}

}
