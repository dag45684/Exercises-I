package entregasSwing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
;

public class Pizza extends JFrame implements ActionListener {

	Pizza(String[] args) {
		super("Pizza Delivery");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container content = getContentPane();
		content.setLayout(new GridBagLayout());
		GridBagConstraints constr = new GridBagConstraints();
		
		JPanel panel = new JPanel(new GridLayout(0, 1));
		panel.setPreferredSize(new Dimension(200, 100));
		panel.setBorder(BorderFactory.createTitledBorder("Select your pizza size:"));
		createSelectionList(panel, "Small", "Medium", "Family");
		constr.gridx = 0;
		constr.gridy = 0;
		constr.gridwidth = 1;
		add(panel, constr);

		panel = new JPanel(new GridLayout(0, 1));
		panel.setPreferredSize(new Dimension(200, 100));
		panel.setBorder(BorderFactory.createTitledBorder("Selectt your dough type:"));
		createSelectionList(panel, "Thin", "Classic", "Cheese-Filled");
		constr.gridx = 0;
		constr.gridy = 1;
		constr.gridwidth = 1;
		add(panel, constr);

		panel = new JPanel(new GridLayout(0, 3));
		panel.setPreferredSize(new Dimension(400, 100));
		panel.setBorder(BorderFactory.createTitledBorder("Select your toppings:"));
		createSelectionList(panel, "Pepperoni", "Onion", "Anchovies", "Bacon", "Jalapenos", "Ground beef");
		constr.gridx = 1;
		constr.gridy = 0;
		constr.gridwidth = 2;
		add(panel, constr);

		panel = new JPanel();
		panel.setPreferredSize(new Dimension(200, 100));
		createSelectionList(panel, "Delivery", "Pick it up");
		constr.gridx = 1;
		constr.gridy = 1;
		constr.gridwidth = 2;
		add(panel, constr);

		panel = new JPanel();
		panel.setPreferredSize(new Dimension(210, 50));
		JButton order = new JButton("Place order");
		order.addActionListener(this);
		order.setPreferredSize(new Dimension(200, 40));
		panel.add(order);
		constr.gridx = 2;
		constr.gridy = 1;
		constr.gridwidth = 1;
		add(panel, constr);

		panel = new JPanel();
		panel.setPreferredSize(new Dimension(50, 100));
		panel.setBackground(Color.WHITE);
		panel.setBorder(BorderFactory.createTitledBorder("Pedido"));
		JTextArea msg = new JTextArea("Welcome to our pizzerie! Please, fill the form to place your order!");
		msg.setEditable(false);
		panel.add(msg);
		constr.gridx = 0;
		constr.gridy = 2;
		constr.gridwidth = 5;
		constr.fill = GridBagConstraints.BOTH;
		add(panel, constr);
		
		pack();
		setLocationRelativeTo(null);

	}

	ArrayList<ButtonGroup> bgroups = new ArrayList<>();
	JTextArea orderDsp = new JTextArea("");
	ButtonGroup grp;

	private void createSelectionList(JPanel panel, String... items) {
		bgroups.add(grp = new ButtonGroup());
		JRadioButton radio;
		for (String item : items) {
			grp.add(radio = new JRadioButton(item));
			radio.setActionCommand(item);
			radio.setFocusable(false);
			panel.add(radio);
		}
	}

	public static void main(final String[] args) {
		SwingUtilities.invokeLater(() -> new Pizza(args).setVisible(true));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = "Your order: ";
	
		for (ButtonGroup bg : bgroups) {
			if(bg.getSelection() != null)
				text += bg.getSelection().getActionCommand() + "\n";
			else
				text += "Not selected ";
		}
		orderDsp.setText(text);
	}
}
