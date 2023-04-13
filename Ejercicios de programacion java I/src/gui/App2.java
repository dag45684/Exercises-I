package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

 public class App2 extends JFrame implements ActionListener{
	 
	 private static final long serialVersionUID = 1L;
	 
	 App2(String[] args){
		 super("My app");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 Container contentPane = getContentPane();
		 JButton button = new JButton("click here");
		 JTextField text = new JTextField();
		 button.addActionListener(e -> {
			System.out.println("Hello World!"); 
		 	text.setText(text.getText().isEmpty() ? "Yay! :D" : "");
		 });
		 //this lambda substitutes the override on the action performed
		 contentPane.add(button, BorderLayout.NORTH);
		 contentPane.add(text, BorderLayout.CENTER);
		 
		 pack();
		 setLocationRelativeTo(null);
	 }
	 
	 public static void main(final String[] args) {
		 SwingUtilities.invokeLater(() -> new App2(args).setVisible(true));
		 
	 }
	 
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 System.out.println("Hello world!");
	 }
 
 }