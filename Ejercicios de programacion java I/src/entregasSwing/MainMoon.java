package entregasSwing;

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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class MainMoon extends JFrame{
	
	private static final long serialVersionUID = 1L;

	private int speed = 0;
	private Moon moon = new Moon();
	private Timer timer; 
	private String[] difficulties = {"Easy", "Medium", "Hard", "Funny"};
	private JButton control;
	private JTextArea target = new JTextArea(" ");;
	
	MainMoon(String[] args){
//		Initial setup config
		super("MyApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		target.setVisible(false);
		add(target, BorderLayout.NORTH);
		
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
			control.setText("Play again");
			timer.stop();
			gameChecker();
		} else {
			target = new JTextArea(rndGame());
			target.setVisible(true);
			control.setText("STOP");
			timer.start();
		}
	}
	
	public String rndGame() {
		int rnd = (int) (Math.random() * 7);
		return "Stop on: " + Moon.getPhases()[rnd];
	}
	
	public void gameChecker () {
		if (target.getText().contains(moon.getName())){
			target.setCaretColor(Color.GREEN);
			target = new JTextArea("Correcto!");
		}
		else {
			target.setCaretColor(Color.RED);
			target = new JTextArea("Incorrecto!");
		}
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
		SwingUtilities.invokeLater(() -> new MainMoon(args).setVisible(true));
	}

}
