package entregasSwing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Counter extends JPanel implements ActionListener {
	
	private Counter g;
	private Counter [] h;
	private JTextField text;
	
	public Counter(Counter g) {
		this.g = g;
		start();
	}
	
	public Counter(Counter [] h) {
		this.h = h;
		start();
	}
	
	private void start() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10), BorderFactory.createLineBorder(Color.GRAY)));
		add(nButton("RESET", Resources.resetIcon));
		text = new JTextField("0", 5);
		text.setFont(Resources.font);
		text.setHorizontalAlignment(JTextField.CENTER);
		text.setEditable(false);
		add(text);
		if (g != null)
			add(nButton("+", Resources.addIcon));
	}
	
	private JButton nButton(String actionCommand, ImageIcon ico) {
		JButton button = new JButton(ico);
		button.setActionCommand(actionCommand);
		button.addActionListener(this);
		return button;
	}
	
	public void inc() {
		int n = Integer.parseInt(text.getText()) + 1;
		text.setText(String.valueOf(n));
	}
	
	public void reset() {
		text.setText("0");
	}
	
	public void dec(int n) {
		int nuevo = Integer.parseInt(text.getText()) - n;
		text.setText(String.valueOf(nuevo));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("+")) {
			inc();
			g.inc();
		}
		else {
			if (g == null) {
				reset();
				for (Counter c: h)
					c.reset();
			}else {
				int n = Integer.parseInt(text.getText());
				reset();
				g.dec(n);
			}
		}
			
	}

}
